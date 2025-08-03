import React from "react";
import "./App.css";

const officeSpaces = [
  {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    img: "https://images.unsplash.com/photo-1506744038136-46273834b3fb"
  },
  {
    name: "WeWork",
    rent: 75000,
    address: "Bangalore",
    img: "https://images.unsplash.com/photo-1464983953574-0892a716854b"
  },
  {
    name: "Regus",
    rent: 60000,
    address: "Pune",
    img: "https://images.unsplash.com/photo-1457694587812-e8bf29a43845"
  },
];

function getRentClass(rent) {
  return rent <= 60000 ? "textRed" : "textGreen";
}

function App() {

  const heading = <h1>Office Space, at Affordable Range</h1>;

  return (
    <div className="App">
      {heading}
      <div>
        {officeSpaces.map((office, idx) => (
          <div key={idx} style={{ marginBottom: "30px" }}>
            {}
            <img
              src={office.img}
              width="25%"
              height="25%"
              alt={office.name + " Office"}
              style={{ display: "block", marginBottom: 10, padding: 2}}
            />
            {}
            <h2>Name: {office.name}</h2>
            <h3 className={getRentClass(office.rent)}>
              Rent: Rs. {office.rent}
            </h3>
            <h3>Address: {office.address}</h3>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
