
import ListofPlayers from "./components/ListOfPlayers";
import Scorebelow70 from "./components/ScoreBelow70";
import OddPlayers from "./components/OddPlayers";
import EvenPlayers from "./components/EvenPlayers";
import ListofIndianPlayers from "./components/ListOfIndianPlayers";

const players = [
  { name: "Virat Kohli", score: 90 },
  { name: "Rohit Sharma", score: 68 },
  { name: "MS Dhoni", score: 72 },
  { name: "Hardik Pandya", score: 55 },
  { name: "Jasprit Bumrah", score: 78 },
  { name: "KL Rahul", score: 66 },
  { name: "Shikhar Dhawan", score: 85 },
  { name: "Rishabh Pant", score: 45 },
  { name: "Bhuvneshwar Kumar", score: 74 },
  { name: "Ravindra Jadeja", score: 65 },
  { name: "Yuzvendra Chahal", score: 52 }
];

const IndianTeam = [
  "Virat Kohli",
  "Rohit Sharma",
  "MS Dhoni",
  "Hardik Pandya",
  "Jasprit Bumrah",
  "KL Rahul",
  "Shikhar Dhawan",
  "Rishabh Pant",
  "Bhuvneshwar Kumar",
  "Ravindra Jadeja",
  "Yuzvendra Chahal"
];

const T20players = [
  "Virat Kohli",
  "Rohit Sharma",
  "KL Rahul",
  "Rishabh Pant",
  "Jasprit Bumrah"
];

const RanjiTrophyplayers = [
  "Cheteshwar Pujara",
  "Ajinkya Rahane",
  "Prithvi Shaw",
  "Hanuma Vihari",
  "Wriddhiman Saha"
];

const IndianPlayers = [...T20players, ...RanjiTrophyplayers];

const flag = false;

function App() {
  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers IndianTeam={IndianTeam} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers IndianTeam={IndianTeam} />
        </div>
        <hr />
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;