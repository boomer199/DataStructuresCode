// Get a reference to the calculator element
const calculator = document.getElementById("calculator");

// Get a reference to the display element
const display = document.getElementById("display");

// Add a click event listener to the calculator
calculator.addEventListener("click", (event) => {
  // Get the value of the clicked button
  const value = event.target.dataset.value;

  // If the clicked element is not a button, do nothing
  if (!value) return;

  // If the value is 'clear', clear the display
  if (value === "clear") {
    display.value = "";
    return;
  }

  // If the value is '=', calculate and display the result
  if (value === "=") {
    // Try to calculate and display the result, or show an error message
    try {
      display.value = eval(display.value);
    } catch (error) {
      display.value = "Error";
    }
    return;
  }

  // Otherwise, append the value to the display
  display.value += value;
});
