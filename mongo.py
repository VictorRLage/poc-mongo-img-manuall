from pymongo.mongo_client import MongoClient
from pymongo.server_api import ServerApi

uri = "mongodb+srv://root:#Gfmanuall@cluster-poc-manuall-img.jiqczye.mongodb.net/?retryWrites=true&w=majority"

# Create a new client and connect to the server
client = MongoClient(uri, server_api=ServerApi('1'))

# Send a ping to confirm a successful connection
try:
    client.admin.command('ping')
    print("Pinged your deployment. You successfully connected to MongoDB!")

    # Access the database and collection
    db = client["collection-test"]
    collection = db["img-base64"]

    # Create a document to insert
    new_document = {
        "img": "asiodhaisdjasiodjaoisjdioasjdioajsçiasdiajsdiajpsodjapiosjdpoasjdpoajsdpajsdaslçdasjdlçijsdçadjsfioçjajjefopaefmewfmpfafmpajwfpampfjakoefaopefopdiojaçsidjaiçsjdiaojsdoiajsdoijaiosdjaoisdjijaodij",
    }

    # Insert the document into the collection
    result = collection.insert_one(new_document)
    print("Inserted document ID:", result.inserted_id)

except Exception as e:
    print(e)