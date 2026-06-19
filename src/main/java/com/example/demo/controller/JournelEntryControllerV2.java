//package com.example.demo.controller;
//
//import com.example.demo.Entity.JournelEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journel")
//public class JournelEntryControllerV2 {
//
//    private Map<Long, JournelEntry> journelEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournelEntry> getAll(){
//        return new ArrayList<>(journelEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournelEntry myEntry){
//        journelEntries.put(myEntry.getId(),myEntry);
//        return true;
//    }
//
//    @GetMapping("/id/{myId}")
//    public JournelEntry getJournelEntry ( @PathVariable Long myId){
//        return journelEntries.get(myId);
//    }
//
//    @DeleteMapping("/id/{myId}")
//    public JournelEntry deleteEntry(@PathVariable Long myId){
//        return journelEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{myId}")
//    public JournelEntry updateEntry(@PathVariable Long myId,@RequestBody JournelEntry myEntry ){
//        return journelEntries.put(myId,myEntry);
//    }
//
//
//
//
//
//
//
//
//}
