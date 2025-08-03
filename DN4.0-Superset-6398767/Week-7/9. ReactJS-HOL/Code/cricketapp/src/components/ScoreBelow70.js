
function Scorebelow70({ players }) {

  const below70 = players.filter(player => player.score < 70);

  return (
    <ul>
      {below70.map((player) => (
        <li>
          {player.name} - Score: {player.score}
        </li>
      ))}
    </ul>
  );
}

export default Scorebelow70;
