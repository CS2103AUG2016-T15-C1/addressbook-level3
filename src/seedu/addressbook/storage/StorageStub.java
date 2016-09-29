package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub implements Storage {

	@Override
	public String getPath() {
		return "";
	}

	@Override
	public AddressBook load() throws StorageOperationException {
		return new AddressBook();
	}

	@Override
	public void save(AddressBook addressBook) throws StorageOperationException {
		// TODO Auto-generated method stub
	}

}