class ItemController {

	def create()
	{
		Item item

		try 
		{
			item = new Item(['status.id':1])
			item.save(failOnError:true)
		}
		catch(Exception e) {
			e.printStackTrace()
			render "Exception ${e}"

		}
	
	}
}