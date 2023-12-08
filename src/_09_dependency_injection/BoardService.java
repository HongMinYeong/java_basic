package _09_dependency_injection;

// 게시판 목록을 관리하는 기능을 제공하는 클래스 (save, delete)

public class BoardService {
    // 1. 생성자를 이용한 DI
//    private final IBoardRepository repository;
//
//    public BoardService(IBoardRepository repository){
//        this.repository = repository;
//    }


    //2. setter를 이용한 DI
    private IBoardRepository repository;
    // 왜 여기는 final 안붙임
    // final은 값이 저장하고 바뀌면 안되는데 지금 여기는 세터라서

    public void setIBoardRepository(IBoardRepository repository){
        this.repository = repository;
    }

    public void save(){
        repository.save();
    }


    public void delete(){
        repository.delete();
    }
}
