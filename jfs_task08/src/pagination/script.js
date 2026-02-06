// Data URL given in the task
const dataURL =
  "https://gist.githubusercontent.com/rvsp/add40254aa126f045837fa5b51f47f1f/raw/pagination.json";

// Rows per page
const rowsPerPage = 10;

let currentPage = 1;
let data = [];

// Required elements
const tableBody = document.getElementById("table-body");
const buttonsDiv = document.getElementById("buttons");

// Fetching data
fetch(dataURL)
    .then(res => res.json())
    .then(result => {
        data = result;
        renderTable();
        renderPagination();
    });

// Load table rows based on page
function renderTable() {
    tableBody.innerHTML = "";

    const start = (currentPage - 1) * rowsPerPage;
    const end = start + rowsPerPage;

    data.slice(start, end).forEach(item => {
        const row = document.createElement("tr");

        row.innerHTML = `
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.email}</td>
        `;

        tableBody.appendChild(row);
    });
}

// Create pagination buttons
function renderPagination() {
    buttonsDiv.innerHTML = "";

    const totalPages = Math.ceil(data.length / rowsPerPage);

    createButton("First", () => changePage(1));
    createButton("Previous", () => {
        if (currentPage > 1) changePage(currentPage - 1);
    });

    // Numbered buttons
    for (let i = 1; i <= totalPages; i++) {
        const btn = document.createElement("button");
        btn.className = "btn btn-outline-primary";
        btn.innerText = i;

        if (i === currentPage) {
            btn.classList.add("active");
        }

        btn.onclick = () => changePage(i);
        buttonsDiv.appendChild(btn);
    }

    createButton("Next", () => {
        if (currentPage < totalPages) changePage(currentPage + 1);
    });
    createButton("Last", () => changePage(totalPages));
}

// Change page and reload
function changePage(page) {
    currentPage = page;
    renderTable();
    renderPagination();
}

// Helper to create control buttons
function createButton(text, action) {
    const btn = document.createElement("button");
    btn.className = "btn btn-outline-primary";
    btn.innerText = text;
    btn.onclick = action;
    buttonsDiv.appendChild(btn);
}
