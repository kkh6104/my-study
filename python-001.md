- 파이썬에서 가변(Mutable) 객체와 불변(Immutable) 객체의 차이
    - 가변 객체 list set dictionary
    - 불변 객체 tuple, int, str, float, bool
        - tuple은 수정 불가
        - int str float bool도 재할당시 새로운 객체를 생성함 
        (문자열 메서드는 기존 문자열을 수정하는게 아니라 새로운 문자열을 반환함)
- 판다스에서 view와 copy의 차이
    - copy는 원본 데이터의 값을 복제하며 새로운 주소에 생성되어 수정 시 원본에 영향을 주지 않는다.
    view는 원본 데이터를 공유하니 수정 시 원본에 영향을 줄 수 있다.
    - 판다스에서는 특정 연산에서 view로 반환하는지 copy로 반환하는지 명확하지 않은 경우가 있어
    loc()를 이용해 원본을 직접 수정하겠다거나 .copy를 이용해 복사본을 이용하겠다고 명확히 해주는게 좋다.
    
- Numpy 에서 view와 copy 반환 복습
    - view : 슬라이싱 / reshape / ravel
    - copy : flatten / copy
