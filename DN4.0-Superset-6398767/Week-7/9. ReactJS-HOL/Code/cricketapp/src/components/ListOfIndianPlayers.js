
function ListOfIndianPlayers({ IndianPlayers }) {
  return (
    <ul>
      {IndianPlayers.map((player) => (
        <li>{player}</li>
      ))}
    </ul>
  );
}

export default ListOfIndianPlayers;
