function showToast(message, type = "success") {
    const toast = document.createElement("div");
    toast.innerText = message;
    toast.className = "toast " + type;
    document.body.appendChild(toast);

    setTimeout(() => {
        toast.remove();
    }, 3000);
}