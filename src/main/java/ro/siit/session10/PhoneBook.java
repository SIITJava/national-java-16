package ro.siit.session10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    // Contact -> [nr1, nr2, ....]
    private Map<Contact, List<String>> contacts = new HashMap<>();

    public void createContact(Contact contact){
        contacts.put(contact, new ArrayList<>());
    }

    public void deleteContact(Contact contact){
        contacts.remove(contact);
    }

    public void addPhoneNumber(Contact contact, String phoneNumber){
        contacts.get(contact).add(phoneNumber);
    }

    public void deletePhoneNumber(Contact contact, String phoneNumber){
        contacts.get(contact).remove(phoneNumber);
    }

    public void printAgenda(){
        for (Contact contact: contacts.keySet()){
            System.out.println(contact.getName());
            for(String phoneNumber: contacts.get(contact)){
                System.out.println("   " + phoneNumber);
            }
        }
    }

    public void printAgenda2(){
        for (Map.Entry<Contact, List<String>> entry: contacts.entrySet()){
            System.out.println(entry.getKey().getName());
            for(String phoneNumber: entry.getValue()){
                System.out.println("   " + phoneNumber);
            }
        }
    }
}
