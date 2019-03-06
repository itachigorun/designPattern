/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/28 18:31
 */
public class Main {
    public static void main(String args[]) {
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;
        folder1 = new Folder("tom的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("陆小凤.jpg");
        file2 = new ImageFile("李寻欢.jpg");
        file3 = new TextFile("陆小凤传奇.txt");
        file4 = new TextFile("小李飞刀.txt");
        file5 = new VideoFile("楚留香传奇.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();
    }
}
