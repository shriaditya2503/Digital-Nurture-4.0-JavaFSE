
function EvenPlayers({ IndianTeam }) {

  const evenPlayers = IndianTeam.filter((_, idx) => idx % 2 !== 0);

  return (
    <ul>
      {evenPlayers.map((player) => (
        <li>{player}</li>
      ))}
    </ul>
  );
}

export default EvenPlayers;
