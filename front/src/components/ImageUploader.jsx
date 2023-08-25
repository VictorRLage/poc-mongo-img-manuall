import React, { useState } from 'react';

function ImageUploader() {
  const [base64Image, setBase64Image] = useState('');

  const handleImageUpload = (event) => {
    const file = event.target.files[0];
    if (file) {
      const reader = new FileReader();
      reader.onload = (e) => {
        const base64String = e.target.result;
        console.log('Base64 Image:', base64String);
        setBase64Image(base64String);
      };
      reader.readAsDataURL(file);
    }
  };

  return (
    <div>
      <input type="file" accept="image/*" onChange={handleImageUpload} />
      {base64Image && (
        <div>
          <h2>Base64 Image:</h2>
          <img src={base64Image} alt="Uploaded" />
          <br />
          <button>enviar</button>
        </div>
      )}
    </div>
  );
}

export default ImageUploader;