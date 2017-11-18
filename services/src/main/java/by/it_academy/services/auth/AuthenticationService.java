package by.it_academy.services.auth;
/*
import by.it.academy.enums.State;
import by.it.academy.pojos.Person;
import by.it.academy.pojos.PersonProfile;
import by.it.academy.services.IPersonService;
import by.it_academy.services.IUserService;*/
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("authService")
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Person person = personService.findByLogin(login);
        System.out.println("User : " + person);
        if (person == null) {
            System.out.println("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        return new MvcUser(person. getName(), person.getSurname(), person.getLogin(), person.getPassword(),
                State.ACTIVE.getState().equals(person.getState()), true, true, true, getGrantedAuthorities(person));
    }


    private List<GrantedAuthority> getGrantedAuthorities(Person person) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (PersonProfile personProfile : person.getPersonProfiles()) {
            System.out.println("PersonProfile : " + personProfile);
            authorities.add(new SimpleGrantedAuthority("ROLE_" + personProfile.getType()));
        }
        System.out.print("authorities :" + authorities);
        return authorities;
    }

}
*/
