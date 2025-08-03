
function OddPlayers({ IndianTeam }) {
  const oddPlayers = IndianTeam.filter((_, idx) => idx % 2 === 0);

  return (
    <ul>
      {oddPlayers.map((player) => (
        <li>{player}</li>
      ))}
    </ul>
  );
}

export default OddPlayers;
