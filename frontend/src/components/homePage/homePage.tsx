import "./homePage.css";
import { useEffect, useState } from "react";

type Politician = {
  id: number;
  name: string;
  party: string;
  description: string;
  image_url: string;
  // etc
};

const HomePage = () => {
  const [politicians, setPoliticians] = useState<Politician[]>([]);
  const fallbackImage = "/static/images/coverNotFound.png";

  useEffect(() => {
    fetch("http://localhost:5000/api/politicians")
      .then((res) => res.json())
      .then((data) => setPoliticians(data))
      .catch((err) =>
        console.error("Failed to load politicians", err)
      );
  }, []);

  return (
    <div>
      <h2>Politician App</h2>

      <strong>Politicians</strong>

      <div className="book-details">
        {politicians.map((politician) => (
          <div className="book-card" key={politician.id}>
            {/* Image */}
            <img
              src={politician.image_url || fallbackImage}
              alt={politician.name}
              style={{ minWidth: "100px", minHeight: "150px" }}
            />

            {/* Info */}
            <div className="book-description">
              <h3>{politician.name}</h3>
              <p>
                <strong>Party:</strong> {politician.party}
              </p>
              <p>{politician.description}</p>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default HomePage;
