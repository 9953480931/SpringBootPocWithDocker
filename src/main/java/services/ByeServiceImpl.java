package services;

import org.springframework.stereotype.Service;

/**
 * Created by jaspreet on 9/18/2018.
 */
@Service
public class ByeServiceImpl implements ByeService {
    @Override
    public String getByeMessage() {
        return "Bye User";
    }
}
