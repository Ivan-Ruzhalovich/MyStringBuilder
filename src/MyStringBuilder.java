
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class MyStringBuilder {
    StringBuilder stb;
    SnapshotManager snapshotManager;

    public MyStringBuilder() {
        this.stb = new StringBuilder();
        this.snapshotManager = new SnapshotManagerImpl();
    }

    public MyStringBuilder(String s) {
        this.stb = new StringBuilder(s);
        this.snapshotManager = new SnapshotManagerImpl();
    }

    public MyStringBuilder(CharSequence charSequence){
        this.stb = new StringBuilder(charSequence);
        this.snapshotManager = new SnapshotManagerImpl();
    }

    public MyStringBuilder (int capacity){
        this.stb = new StringBuilder(capacity);
        this.snapshotManager = new SnapshotManagerImpl();
    }

    public void undo (){
        try {
            String str = snapshotManager.getSnapShot();
            this.stb.delete(0,this.stb.capacity());
            this.stb.append(str);
        }
        catch (NoSuchElementException e){
            System.out.println("Список состояний пуст!");
        }

    }
    // Добавляет строковое представление аргумента boolean к последовательности.
    public StringBuilder append(boolean b){
        snapshotManager.save(this.toString());
        return stb.append(b);
    }

   //Добавляет строковое представление аргумента char к этой последовательности.
    public StringBuilder append(char c){
        snapshotManager.save(this.toString());
        return stb.append(c);
    }

    //Добавляет строковое представление char аргумента массива к этой последовательности.
    public StringBuilder append(char[] str){
        snapshotManager.save(this.toString());
        return stb.append(str);
    }

    //    Добавляет строковое представление подмассива char аргумента массива к этой последовательности.
    public StringBuilder append(char[] str, int offset, int len){
        snapshotManager.save(this.toString());
        return this.stb.append(str,offset,len);
    }

    //    Добавляет строковое представление аргумента double к этой последовательности.
    public StringBuilder append(double d){
        snapshotManager.save(this.toString());
        return this.stb.append(d);
    }

    //    Добавляет строковое представление аргумента float к этой последовательности.
    public StringBuilder append(float f){
        snapshotManager.save(this.toString());
        return this.stb.append(f);
    }

    //    Добавляет строковое представление аргумента int к этой последовательности.
    public StringBuilder append(int i){
        snapshotManager.save(this.toString());
        return this.stb.append(i);
    }

    //    Добавляет строковое представление аргумента long к этой последовательности.
    public StringBuilder append(long lng){
        snapshotManager.save(this.toString());
        return this.stb.append(lng);
    }

    //    Добавляет указанную последовательность символов к данному Appendable.
    public StringBuilder append(CharSequence s){
        snapshotManager.save(this.toString());
        return this.stb.append(s);
    }

    //    Добавляет подпоследовательность указанной последовательности CharSequence к данной последовательности.
    public StringBuilder append(CharSequence s, int start, int end) {
        snapshotManager.save(this.toString());
     return this.stb.append(s,start,end);
    }

    //    Добавляет строковое представление аргумента Object.
    public StringBuilder append(Object obj){
        snapshotManager.save(this.toString());
        return this.stb.append(obj);
    }

    //    Добавляет указанную строку к данной последовательности символов.
    public StringBuilder append(String str){
        snapshotManager.save(this.toString());
        return this.stb.append(str);
    }

    //    Добавляет указанное StringBuffer к данной последовательности.
    public StringBuilder append(StringBuffer sb) {
        snapshotManager.save(this.toString());
        return this.stb.append(sb);
    }

    //Добавляет строковое представление аргумента codePoint к этой последовательности.
    public StringBuilder appendCodePoint(int codePoint){
        snapshotManager.save(this.toString());
        return this.stb.append(codePoint);
    }

    //    Возвращает текущую емкость.
    public int capacity(){
        return this.stb.capacity();
    }

    //    Возвращает char значение в этой последовательности по указанному индексу.
    public char charAt(int index){
        return stb.charAt(index);
    }

    //    Возвращает поток значений из этой последовательности int, расширяющий ее до нуля .char
    public IntStream chars(){
        return this.stb.chars();
    }

    //    Возвращает символ (кодовую точку Unicode) по указанному индексу.
    public int codePointAt(int index){
        return this.stb.codePointAt(index);
    }

    //    Возвращает символ (кодовую точку Unicode) перед указанным индексом.
    public int codePointBefore(int index){
        return this.stb.codePointBefore(index);
    }

    //    Возвращает количество кодовых точек Unicode в указанном текстовом диапазоне этой последовательности.
    public int codePointCount(int beginIndex, int endIndex){
        return this.stb.codePointCount(beginIndex,endIndex);
    }

    //    Возвращает поток значений кодовых точек из этой последовательности.
    public IntStream codePoints(){
        return this.stb.codePoints();
    }

    //    Сравнивает два StringBuilder экземпляра лексикографически.
    public int compareTo(StringBuilder another){
        return this.stb.compareTo(another);
    }

    //    Удаляет символы в подстроке данной последовательности.
    public StringBuilder delete(int start, int end){
        return this.stb.delete(start,end);
    }

    //    Удаляет char в указанной позиции в этой последовательности.
    public StringBuilder deleteCharAt(int index){
        return this.stb.deleteCharAt(index);
    }

    //    Гарантирует, что емкость по крайней мере равна указанному минимуму.
    public void ensureCapacity(int minimumCapacity){
        this.stb.ensureCapacity(minimumCapacity);
    }

    //    Символы копируются из этой последовательности в целевой массив символов dst.
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin){
        this.stb.getChars(srcBegin,srcEnd,dst,dstBegin);
    }

    //    Возвращает индекс первого вхождения указанной подстроки в данной строке.
    public int indexOf(String str){
        return this.stb.indexOf(str);
    }

    //    Возвращает индекс первого вхождения указанной подстроки в данной строке, начиная с указанного индекса.
    public int indexOf(String str, int fromIndex){
        return this.stb.indexOf(str,fromIndex);
    }

    //    Вставляет строковое представление аргумента boolean в эту последовательность.
    public StringBuilder insert(int offset, boolean b){
        return this.stb.insert(offset,b);
    }

    //    Вставляет строковое представление аргумента char в эту последовательность.
    public StringBuilder insert(int offset, char c){
        return this.stb.insert(offset,c);
    }

    //    Вставляет строковое представление char аргумента массива в эту последовательность.
    public StringBuilder insert(int offset, char[] str){
        return this.stb.insert(offset,str);
    }

    //    Вставляет строковое представление подмассива str аргумента массива в эту последовательность.
    public StringBuilder insert(int index, char[] str, int offset, int len){
        return this.stb.insert(index,str,offset,len);
    }

    //    Вставляет строковое представление аргумента double в эту последовательность.
    public StringBuilder insert(int offset, double d){
        return this.stb.insert(offset,d);
    }

    //    Вставляет строковое представление аргумента float в эту последовательность.
    public StringBuilder insert(int offset, float f){
        return this.stb.insert(offset,f);
    }

    //    Вставляет строковое представление второго int аргумента в эту последовательность.
    public StringBuilder insert(int offset, int i){
        return this.stb.insert(offset,i);
    }

    //    Вставляет строковое представление аргумента long в эту последовательность.
    public StringBuilder insert(int offset, long l){
        return this.stb.insert(offset,l);
    }

    //    Вставляет указанное CharSequence в данную последовательность.
    public StringBuilder insert(int dstOffset, CharSequence s){
        return this.stb.insert(dstOffset,s);
    }

    //    Вставляет подпоследовательность указанного CharSequence в данную последовательность.
    public StringBuilder insert(int dstOffset, CharSequence s, int start, int end){
        return this.stb.insert(dstOffset,s,start,end);
    }

    //    Вставляет строковое представление Object аргумента в данную последовательность символов.
    public StringBuilder insert(int offset, Object obj){
        return this.stb.insert(offset,obj);
    }

    //    Вставляет строку в данную последовательность символов.
    public StringBuilder insert(int offset, String str){
        return this.stb.insert(offset,str);
    }

    //    Возвращает индекс последнего вхождения указанной подстроки в данной строке.
    public int lastIndexOf(String str){
        return this.stb.lastIndexOf(str);
    }

    //    Возвращает индекс последнего вхождения указанной подстроки в данной строке, выполняя поиск в обратном направлении, начиная с указанного индекса.
    public int lastIndexOf(String str, int fromIndex){
        return this.stb.lastIndexOf(str,fromIndex);
    }

    //    Возвращает длину (количество символов).
    public int length(){
        return this.stb.length();
    }

    //    Возвращает индекс в этой последовательности, смещенный относительно заданного index по codePointOffset кодовым точкам.
    public int offsetByCodePoints(int index, int codePointOffset){
        return this.stb.offsetByCodePoints(index,codePointOffset);
    }

    //    Заменяет символы в подстроке данной последовательности на символы из указанной String.
    public StringBuilder replace(int start, int end, String str){
        return this.stb.replace(start,end,str);
    }

    //    Заменяет данную последовательность символов на обратную.
    public StringBuilder reverse(){
        return this.stb.reverse();
    }

    //    Символу по указанному индексу присваивается значение ch.
    public void setCharAt(int index, char ch){
        this.stb.setCharAt(index,ch);
    }

    //    Устанавливает длину последовательности символов.
    public void setLength(int newLength){
        this.stb.setLength(newLength);
    }

    //    Возвращает новую последовательность символов, которая является подпоследовательностью данной последовательности.
    public CharSequence subSequence(int start, int end){
        return this.stb.subSequence(start,end);
    }

    //    Возвращает новый String, содержащий подпоследовательность символов, которые в данный момент содержатся в этой последовательности символов.
    public String substring(int start){
        return this.stb.substring(start);
    }

    //    Возвращает новый String, содержащий подпоследовательность символов, которые в данный момент содержатся в этой последовательности.
    public String substring(int start, int end){
        return this.stb.substring(start,end);
    }

    //    Попытки сократить объем памяти, используемый для последовательности символов.
    public void trimToSize(){
        this.stb.trimToSize();
    }

    //    Возвращает строку, представляющую данные в этой последовательности.
    @Override
    public String toString() {
        return this.stb.toString();
    }
}