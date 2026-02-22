const form = document.getElementById("employeeForm");

form.addEventListener("submit", async (e) => {
    e.preventDefault();

    const id = document.getElementById("employeeId").value;

    const employee = {
        employeeId: id,
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        location: document.getElementById("location").value
    };

    const response = await fetch(`http://localhost:9090/employees/update/${id}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(employee)
    });

    if (response.ok) {
        alert("Employee Saved/Updated!");
        form.reset();
        loadEmployees();
    }
});
async function loadEmployees() {
    const response = await fetch("http://localhost:9090/employees/displayAll");
    const data = await response.json();

    const list = document.getElementById("employeeList");
    list.innerHTML = `
        <table border="1" width="100%" style="margin-top:10px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Location</th>
                <th>Actions</th>
            </tr>
        </table>
    `;

    const table = list.querySelector("table");

    data.forEach(emp => {
        const row = table.insertRow();

        row.innerHTML = `
            <td>${emp.employeeId}</td>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.location}</td>
            <td>
                <button onclick="editEmployee('${emp.employeeId}','${emp.name}','${emp.email}','${emp.location}')">Edit</button>
                <button onclick="deleteEmployee('${emp.employeeId}')">Delete</button>
            </td>
        `;
    });
}

function editEmployee(id, name, email, location) {
    document.getElementById("employeeId").value = id;
    document.getElementById("name").value = name;
    document.getElementById("email").value = email;
    document.getElementById("location").value = location;
}

async function deleteEmployee(id) {
    await fetch(`http://localhost:9090/employees/delete/${id}`, {
        method: "DELETE"
    });

    alert("Employee Deleted");
    loadEmployees();
}