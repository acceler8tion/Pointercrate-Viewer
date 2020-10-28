## 브렌치 생성/삭제 시 주의사항

- 브렌치 생성시 **자기 닉네임** 으로.
- 브렌치를 삭제 할 시, 반드시 Pull Request들이 성공적으로 merge된 이후인지 확인

## Pull Request 넣을때 주의사항

- **제목**은 반드시 [`$NEXT_VERSION`] `$PREVIEW_DESC...` 형식으로 작성, 가능하면 한글사용 ㄴㄴ
- **주의!** [Prepare `$NEXT_VERSION`]가 아닌 [`$NEXT_VERSION`]. Prepare 넣지말것

> 예시:
>
> [1.0.0] Added recyclerview, Fixed NullPointerException (Issue: #214) //이슈는 해당이슈가 이슈페이지에 있을때만 쓸것

</br>

- **내용**작성 시 구체적으로 서술, 한글 ㄱㄴ

> **표** 같은거 사용하면 좋음

</br>

</br>

</br>

**내용은 언제든 추가될 수 있음**
