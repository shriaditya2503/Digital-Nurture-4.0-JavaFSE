import React, { useState } from "react";

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const EURO_RATE = 80;

  const handleAmount = (e) => setAmount(e.target.value);
  const handleCurrency = (e) => setCurrency(e.target.value);

  const handleSubmit = (e) => {
    e.preventDefault();

    if (currency.toLowerCase() === "euro") {
      const euro = Number(amount) * EURO_RATE;
      alert(`Converting to  Euro Amount is ${euro}`);
    } else {
      alert(`Currently conversion is only supported for Euro.`);
    }
  };

  return (
    <div>
      <h1 style={{ color: "green", fontWeight: "bold" }}>
        Currency Convertor!!!
      </h1>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: 10 }}>
          <label>
            Amount:
            <input
              type="number"
              value={amount}
              onChange={handleAmount}
              style={{ marginLeft: 10 }}
            />
          </label>
        </div>
        <div>
          <label>
            Currency:
            <input
              type="text"
              value={currency}
              onChange={handleCurrency}
              style={{ marginLeft: 10 }}
            />
          </label>
        </div>
        <button type="submit" style={{ marginTop: 10 }}>
          Submit
        </button>
      </form>
    </div>
  );
}

function App() {
  const [counter, setCounter] = useState(5);

  const handleIncrement = () => {
    setCounter(prev => prev + 1);
    sayHello();
  };

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const handleDecrement = () => setCounter(prev => prev - 1);

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "40px" }}>
      <div>
        <div style={{ fontSize: 20, marginBottom: 10 }}>{counter}</div>

        <button onClick={handleIncrement}>Increment</button>
        <br /><br />

        <button onClick={handleDecrement}>Decrement</button>
        <br /><br />

        <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
        <br /><br />

        <button onClick={handleClick}>Click on me</button>
      </div>
      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
