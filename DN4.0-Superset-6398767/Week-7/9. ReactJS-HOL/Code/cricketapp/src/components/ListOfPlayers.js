
function ListOfPlayers({ players }) {
  return (
    <ul>
      {players.map((player) => (
        <li>
          {player.name} - Score: {player.score}
        </li>
      ))}
    </ul>
  );
}

export default ListOfPlayers;
