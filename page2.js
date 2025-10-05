async function registerStudent() {
    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const username = document.getElementById('username').value.trim();
    const password = document.getElementById('password').value.trim();
   

    const messageEl = document.getElementById('message');

    if (!name || !email || !username || !password  ) {
        messageEl.textContent = "Please fill all fields!";
        return;
    }

    try {
        const response = await fetch('http://localhost:8080/registerStudent', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ name, email, username, password })
        });

        const result = await response.text();
        messageEl.textContent = result;

        if (result === "Registration successful") {
            setTimeout(() => {
                window.location.href = "page3.html";
            }, 1500);
        }
    } catch (error) {
        console.error('Error:', error);
        messageEl.textContent = "Server error, try again later";
    }
}