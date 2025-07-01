# ⚽CS Worriors- Football Management System
A **desktop-based** player and coach management system built with **Java Swing** for a local university football club. This app streamlines tracking player details, personal attributes, and coaching info through an **interactive GUI**.

---
## 💻 Features 
- **🧔Player Management**: Add, update, and view player details like name, jersey number, position, fitness, and level.

- **🏵️Personal Attributes Panel**: Capture specific player traits with yes/no options.

- **🫀Coach Panel**: Input coaching details, including type and captaincy status.

- **🧠Mutual Exclusivity Logic**: Ensures consistent data by disabling the Coach Panel when any personal attribute is marked affirmative.

- **⚙️File Handling**: Save and retrieve player data from local storage for persistence.

## Core Logic Overview 🧠
- **♟️Event-Driven UI**: Utilizes Java Swing event listeners to handle button clicks, radio button selections, and form inputs dynamically.

- **🧱Mutual Exclusivity**: If any personal attribute for a player is selected as “Yes,” the Coach Panel automatically disables to prevent conflicting data entries. This enforces data integrity by not allowing both personal attributes and coaching info simultaneously.

- **👬Data Validation & Updates**: Inputs are validated before saving. 
- **📁File I/O**: Player data is serialized and saved to files, enabling persistent storage and retrieval across sessions.
## User Interaction Flow❕

- User opens the app and **adds** a new player informations.

- Selects player details including personal attributes or coach info.

- ❎If any personal attribute is set to “Yes,” the Coach Panel **disables automatically**.

- On form submission, data is **validated**, saved locally, and **displayed in the player list**.

- Users can **load saved player data** anytime to review or edit.

## 🏗️Architecture
**The app loosely follows the MVC (Model-View-Controller) design pattern:**

- **Model**: Player and Coach classes encapsulate data.

- **View**: Java Swing UI components handle user interaction.

- **Controller**: Event listeners manage input processing and data flow between Model and View.
