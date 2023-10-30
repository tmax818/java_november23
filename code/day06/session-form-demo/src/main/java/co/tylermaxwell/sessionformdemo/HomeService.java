package co.tylermaxwell.sessionformdemo;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class HomeService {

    public void setCount(HttpSession session) {
        if(session.getAttribute("count") == null){
            session.setAttribute("count", 0);
        } else {
            int count = (int)session.getAttribute("count");
            session.setAttribute("count", count + 1);
        }
    }

    public void incrementCounter(HttpSession session) {
        int count = (int)session.getAttribute("count");
        session.setAttribute("count", count++);
    }
    
}
