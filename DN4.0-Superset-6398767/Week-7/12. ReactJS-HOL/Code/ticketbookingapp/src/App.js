import React, { useState } from "react";

const flights = [
  { id: 1, name: "Indigo 6E203", src: "Delhi", dest: "Mumbai", price: 4500 },
  { id: 2, name: "Air India 101", src: "Bangalore", dest: "Chennai", price: 3200 },
  { id: 3, name: "Vistara UK809", src: "Pune", dest: "Kolkata", price: 6000 },
];

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function UserGreeting() {
  return <h1 style={{ margin: "30px 0" }}>Welcome back</h1>;
}

function GuestGreeting() {
  return <h1 style={{ margin: "30px 0" }}>Please sign up.</h1>;
}

function FlightList({ isLoggedIn }) {
  return (
    <div>
      <h3>Available Flights:</h3>
      <table style={{ borderCollapse: "collapse", margin: "20px auto", minWidth: "340px" }}>
        <thead>
          <tr>
            <th style={{ border: '1px solid #ccc', padding: 6 }}>Name</th>
            <th style={{ border: '1px solid #ccc', padding: 6 }}>From</th>
            <th style={{ border: '1px solid #ccc', padding: 6 }}>To</th>
            <th style={{ border: '1px solid #ccc', padding: 6 }}>Price (₹)</th>
            <th style={{ border: '1px solid #ccc', padding: 6 }}>Action</th>
          </tr>
        </thead>
        <tbody>
          {flights.map(flight => (
            <tr key={flight.id}>
              <td style={{ border: '1px solid #ccc', padding: 6 }}>{flight.name}</td>
              <td style={{ border: '1px solid #ccc', padding: 6 }}>{flight.src}</td>
              <td style={{ border: '1px solid #ccc', padding: 6 }}>{flight.dest}</td>
              <td style={{ border: '1px solid #ccc', padding: 6 }}>{flight.price}</td>
              <td style={{ border: '1px solid #ccc', padding: 6 }}>
                {isLoggedIn
                  ? <button onClick={() => alert(`Ticket booked for ${flight.name}!`)}>Book</button>
                  : <button disabled>Book</button>
                }
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div style={{ maxWidth: 700, margin: "80px auto", textAlign: "center" }}>
  
      {isLoggedIn
        ? <UserGreeting />
        : <GuestGreeting />
      }
  
      {isLoggedIn
        ? <LogoutButton onClick={handleLogoutClick} />
        : <LoginButton onClick={handleLoginClick} />
      }
  
      <div style={{ marginTop: "40px" }}>
        <FlightList isLoggedIn={isLoggedIn} />
      </div>
    </div>
  );
}

export default App;
