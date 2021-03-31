package com.example.shiyun.db;

import android.app.Application;

import com.example.shiyun.Diary;
import com.example.shiyun.Blank;
import com.example.shiyun.Question;
import com.raizlabs.android.dbflow.config.FlowManager;

public class MyApplication extends Application {
    private String user;
    private String level="0";

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
        createDiary();
        createBlank();
        createShiyi();
    }

    private void createDiary(){
        Diary one=new Diary();
        one.setContent("首联、颔联、颈联、尾联是律诗的基本构成部分，是相邻两句的合称，即以每两句为对联的学名。\n" +
                "律诗有五言和七言之分:\n" +
                "七言律诗（简称七律）每个句子都有7个字，共8句；\n" +
                "五言律诗（简称五律）每个句子都有5个字，共8句。\n" +
                "律诗共八行，一个逗号为一句，前两句即首联，第三，四句即颔联，第五，六句即颈联，最后两句即尾联。其中颔联和颈联要求必须对仗。例子：\n" +
                "闻官军收河南河北——七律\n" +
                "(唐)杜甫 　　\n" +
                "剑外忽传收蓟北，初闻涕泪满衣裳。——首联（不要求对仗）\n" +
                "却看妻子愁何在，漫卷诗书喜欲狂。——颔联（要求对仗）\n" +
                "白日放歌须纵酒，青春作伴好还乡。——颈联（要求对仗）\n" +
                "即从巴峡穿巫峡，便下襄阳向洛阳。——尾联（不要求对仗）");
        one.setTitle("律诗的构成");
        one.save();

        Diary two=new Diary();
        two.setContent("登临诗即古人登山、登台（高台）、登楼之时所创作的诗篇。孔子说：“君子登高必赋”，登高赋诗是中国古代知识分子所向往和推崇的习惯，是代代相传的一种文化现象。从《诗经》的“陟彼景山，松柏丸丸”到楚辞的“乘鄂渚以反顾”；从汉赋的\n" +
                "“华实蔽野，黍稷盈畴”到南朝乐府的“望郎上青楼”，中国诗歌现实主义和浪漫主义的两大源流从一开始，就畅泻着登临诗的淙淙清泉。登临诗在问世之初，就展示出巨大的生命活力。\n" +
                "登临诗与一般的写景抒情的诗在阅读分析时有所不同，应该注意登临诗的以下特点：\n" +
                "1.景象壮观，境界开阔。\n" +
                "在古代的登临诗里，我们会发现一个奇妙的现象，那就是人远眺空间的时候，往往他也望见了时光。空间有时候是一个载体，越辽阔，其实人对时间那种悠长隽永和庄严的体会也越深刻。当人在山巅水涯的时候会真正体会到，仰观宇宙之大，俯察品类之盛，登临展现的就是这样一种旷茫无边背景下的景与情，所以登临诗从空间的广阔，到时间的深邃，不仅是视野的广阔，而且有诗的开阔浑厚的精神气度。\n" +
                "2.“现实心境”与“登临诗境”的完美契合。\n" +
                "登上高处的旷茫和辽远，使人眼界开阔，心境豁然,更能激发诗人指点江山、激扬文字的豪情和对人生、自然、宇宙的思考，体味亘古如斯的山川从远古走来，带着远古的诗情画意和风流人物，一步一步走到了我们的生命里，这里的“高”已经不是一个物理的高度，它应该体现一种开阔的视野所带来的一种心灵的丰富精神的高度。总之，绘壮景、写豪情、感沧桑是优秀登高诗的常态。\n" +
                "3.结合儒家文学传统。\n" +
                "儒家文化是中国传统文化的主流和重要组成部分，强调“入世”，重视现实，求理想，奋发向上，自强不息，百折不挠，以天下为己任，具有强烈的责任感与使命感，也主张“士不可不弘毅，任重而道远，仁以为己任，以“平治天下”为“舍我其谁”之重责。所以儒家这种“济\n" +
                "天下”的积极参与的思想在登临诗歌中处处体现。");
        two.setTitle("登临诗的特点");
        two.save();

        Diary three=new Diary();
        three.setContent("怀古咏史诗,主要是以历史事件、历史人物、历史陈迹为题材,借登高望远、咏叹史实、怀念古迹来表达感慨兴衰、寄托哀思、托古讽今等目的的诗歌.\n" +
                "用典抒情,即在诗歌中援引史实,使用典故来抒情.用典是指在文章中引用、截取前人的语句或使用前人的事迹故事,借以表达某种特定的含义,以抒发某种思想与情感 .用典可以拓展意境,使诗词情意显得含蓄,达到字少意丰的效果.借古讽今是咏史诗常见的表现手法,即诗人往往以历史事件、历史人物、历史陈迹为题材,借咏叹史实,凭吊古迹来达到感慨盛衰、托古讽今的目的.诗家怀古咏史,大致有三种情况,\n" +
                "一种是对历史作冷静的理性的思考,诗人自己并不置身其中,如杜牧和王安石都写过《题乌江亭》诗,杜牧为项羽自刎而惋惜：“江东子弟多才俊.卷土重来未可知.”然而王安石却意识到项羽的失败是历史的必然：“江东子弟今虽在,肯为君王卷土来?”.\n" +
                "另一种情况是把史实与现实扭结在一起,或是感慨个人遭遇,或是抨击社会现实,如宋词《念奴娇·赤壁怀古》和《京口北固亭怀古》.\n" +
                "还有一种情况是只抓住历史的一些影子,故意借题发挥,如李商隐的《贾生》就是这么一首以古讽今的杰出之作。");
        three.setTitle("怀古咏史诗中的用典");
        three.save();

        Diary four=new Diary();
        four.setContent("黄鹤楼位于湖北省武汉市。江南三大名楼之一，国家旅游胜地四十佳。素有“天下江山第一楼”之美誉。冲决巴山群峰，接纳潇湘云水，浩荡长江在三楚腹地与其最长支流汉水交汇，造就了武汉隔两江而三镇互峙的伟姿。这里地处江汉平原东缘，鄂东南丘陵余脉起伏于平野湖沼之间，龟蛇两山相夹，江上舟辑如织。\n" +
                "黄鹤楼，原址在武昌蛇山黄鹄矶头，相传始建于公元223年。历史上黄鹤楼屡建屡毁，其最后的一次被毁是1884年。1957年建长江大桥武昌引桥时，占用了黄鹤楼旧址，1981年重建黄鹤楼时，选址在距旧址约1000米的蛇山峰岭上。武汉是“百湖之市”，如果把长江、汉水、东湖、南湖以及星罗棋布的湖看成是连绵的水域的话，城市陆地则是点缀在水面上的浮岛，武汉就是一座漂浮在水上的城市。在这个壮阔的水面上，有一条中脊显得格外突出。从西向东，依次分布着梅子山、龟山、蛇山、洪山、珞珈山、磨山、喻家山等，这一连串的山脊宛如巨龙卧波，武汉城区第一峰喻家山是龙头，在月湖里躺着的梅子山则是龙尾。这是武汉的地理龙脉。黄鹤楼恰好位于巨龙的腰上。骑龙在天，乘势而为，黄鹤楼的这种选址似乎透露出某种玄机。 \n" +
                "关于黄鹤楼的得名，有“因山”、“因仙”两种说法。“因仙”一说曾有仙人驾鹤经此，遂以得名。一说是曾有道士在此地辛氏酒店的墙上画一只会跳舞的黄鹤，店家生意因此大为兴隆。十年后道士重来，用笛声招下黄鹤，乘鹤飞去，辛氏遂出资建楼。这些神话传说很有趣，也很动人，但都不是黄鹤楼楼名真正的由来。历代的考证都认为，黄鹤楼的名字是因为它建在黄鹄山上而取的。古代的“鹄”与“鹤”二字一音之转，互为通用，故名为“黄鹤楼”。因山得名的说法为黄鹤楼得名奠定了地理学基石，因仙得名的说法却令赏楼者插上了纵横八极的想象翅膀，满足了人们的求美情志和精神超越需求。两种说法各具功能，以往并行不悖，相得益彰，今后必将彼此映照，共存于永久。\n" +
                "历代的名人如崔颢、李白、白居易、贾岛、夏竦、陆游等都曾先后到这里游览，吟诗、作赋。 唐代诗人崔颢登上黄鹤楼赏景写下了一首千古流传的名作；‘昔人已乘黄鹤去，此地空余黄鹤楼。黄鹤一去不复返，白云千载空悠悠。晴川历历汉阳树，芳草萋萋鹦鹉洲。日暮乡关何处是，烟波江上使人愁。” 李白登上黄鹤楼，放眼楚天，胸襟开阔，诗兴大发，正要提笔写诗时，却见崔颢的诗，自愧不如只好说：“眼前有景道不得，崔颢题诗在上头”。崔颢题诗，李白搁笔，从此名气大盛。");
        four.setTitle("黄鹤楼");
        four.save();

        Diary five=new Diary();
        five.setContent("咏史怀古是我国古典诗歌的重要题材,也是抒情诗的传统表现形式之一。东汉班固首以“咏史”标目,中经阮籍登广陵怀古的“时无英雄,使竖子成名”的浩叹,给登临怀古诗以很大的影响。以后左思、陶渊明、颜延之等都有名篇传世。梁代萧统编《文选》,以系列式划分诗歌的不同题材,特立“咏史”一目,可见作者己经很多了。此后,咏史怀古诗创作更是代不乏人,名篇佳作蔚成大观。纵观咏史怀古诗的发展,可以分做4个阶段,即:产生创格阶段,开拓发展阶段,创作高潮阶段,别开新径的余绪阶段。\n" +
                "史家论及班固的《咏史》,往往是以其“质木无文”晒之,但我们探究咏史诗的发展却不能忽略其开先河之功。西晋左思《咏史》八首,扬弃了班固等人咏史之作往往泥着于叙事的缺点，真正实现了“诗”“史”结合，使史事的叙述和咏怀较好结合，使咏史诗体格一新。    \n" +
                "左思以后,咏史诗创作进人开拓发展阶段。陶渊明以“咏史”为形式,以讴歌失败的英雄为主要内容,来表达自己的怀抱,拓宽了咏史诗的题材。\n" +
                "初盛唐的咏史怀古诗创作呈现了较显著的变化,题材进一步拓宽,思想内容不断拓展,在传统的抒写个人怀抱的基础之上,与社会现实问题的联系更加紧密,政治倾向性更加鲜明,表现手法愈趋多样。\n" +
                "中晚唐的咏史怀古诗创作,无论数量和质量都蔚为可观,可以称得上是发展高峰阶段。首先值得论及的当属中唐诗歌预备期的大历诗坛。大历诗人大都写有咏史怀古之作,非常集中地表现出了对往世繁华的心追神往、伤时哀世的苦闷与无可奈何的感伤。不少篇章直接对历史兴废或是非进行评价,带有浓厚的史论色彩,表现了诗人进步的历史观。\n" +
                "宋元明清继承了前代咏史怀古诗的传统,创作代不乏人,比较鲜明的特点是:借咏史批评时政,更多地表现出对人民苦难的同情，具有强烈的时代色彩，承接中晚唐形成的高潮局面,又进人了一个新的时期。虽称之为余绪期,但并非强弩之末,而是以千姿百态之作,为咏史诗百花园增添了新的色彩。");
        five.setTitle("怀古咏史诗的发展历程");
        five.save();

        Diary six=new Diary();
        six.setContent("乌衣巷位于南京市秦淮区秦淮河上文德桥旁的南岸，地处夫子庙秦淮风光带核心地带，是中国历史最悠久最著名的古巷，当时中国世家大族居住之地，三国时是吴国戍守石头城部队营房所在地。\n" +
                "乌衣巷是晋代王谢两家豪门大族的宅第，两族子弟都喜欢穿乌衣以显身份尊贵，因此得名。乌衣巷门庭若市，冠盖云集，走出了王羲之、王献之，及山水诗派鼻祖谢灵运等文化巨匠。乌衣巷见证了王谢的艺术成就，与两大家族的历史，乃至整个中国文化的历史紧密相连。\n" +
                "1997年，秦淮区人民政府恢复了乌衣巷，挖掘、展示乌衣巷源远流长的历史，并重建了具有民族风格的王谢古居纪念馆。历经千年的沧桑，如今的乌衣巷已不复昔日的繁华，没有豪门士族的觥筹交错，取而代之的是游人探访王谢华堂踪迹。\n" +
                "乌衣巷的得名有很多说法。\n" +
                "第一种说法:这里曾是东吴时期的禁卫军驻地，由于军士悉穿乌衣，由此得名乌衣营，后改乌衣巷。\n" +
                "第二种说法:东晋时期王谢两家居住于此，而两族子弟都喜欢穿乌衣以彰显身份尊贵，所以得名乌衣巷。这种说法在南京民间广为流传。\n" +
                "第三种说法:来自南宋时编纂的《六朝事迹编类》，称刘禹锡诗中的\"旧时王谢堂前燕\"乃是误笔，原是\"旧时王榭堂前燕\"。南京曾有个名叫王榭的人，以航海为业。海船失事，他误入乌衣国，娶妻生子。后来，王榭独自返回故乡南京，为了怀念乌衣国的时光，便将所住的巷子更名乌衣巷。");
        six.setTitle("乌衣巷");
        six.save();

        Diary seven=new Diary();
        seven.setContent("黍离之悲是一个汉语成语，指对国家残破，今不如昔的哀叹。也指国破家亡之痛。出自于《诗经》\"王风\"，历来被视为是悲悼故国的代表作。\n" +
                "《诗经》\"王风\"，历来被视为是悲悼故国的代表作，说的是两千多年前的一个夏天，周大夫行役路过镐京，看到埋没在荒草中的旧时宗庙遗址，有感于周室的被颠覆，悲伤而作《黍离》。描述了当一个人看到心中的理想大厦坍塌埋没于苗草中时的难受心情，这首诗两千年来不断被传唱着。以至于人们把发自心底的、失落的悲哀称作“黍离之悲”。\n" +
                "南宋词人姜夔的《扬州慢·淮左名都》见《白石道人歌曲》。其词序云:\"淳熙丙申至日，予过维扬。夜雪初霁，荠麦弥望。入其城则四顾萧条，寒水自碧。暮色渐起，戍角悲吟。予怀怆然，感慨今昔，因自度此曲。千岩老人以为有《黍离》之悲也。\"\n" +
                "《黍离》全文\n" +
                "彼黍离离，彼稷之苗。行迈靡靡，中心摇摇。知我者，谓我心忧，不知我者，谓我何求。悠悠苍天，此何人哉。\n" +
                "彼黍离离，彼稷之穗。行迈靡靡，中心如醉。知我者，谓我心忧，不知我者，谓我何求。悠悠苍天，此何人哉。\n" +
                "彼黍离离，彼稷之实。行迈靡靡，中心如噎。知我者，谓我心忧，不知我者，谓我何求。悠悠苍天，此何人哉。");
        seven.setTitle("《黍离》之悲");
        seven.save();

        Diary eight=new Diary();
        eight.setContent("杜牧（公元803－约853年），字牧之，号“樊川居士”，号称杜紫薇。京兆万年（今陕西西安）人，晚唐诗人。（来源：中书省别名紫微省，因此人称其为“杜紫薇” ）唐代文学家，后人称杜甫为“老杜”，称杜牧为“小杜”。《阿房宫赋》亦颇有名。\n" +
                "杜牧是杰出的诗人、散文家，是宰相杜佑之孙，杜从郁之子，唐文宗大和二年26岁中进士，授弘文馆校书郎。后赴江西观察使幕，转淮南节度使幕，又入观察使幕。史馆修撰，膳部、比部、司勋员外郎，黄州、池州、睦州刺史等职，最终官至中书舍人。晚唐杰出诗人，尤以七言绝句著称，内容以咏史抒怀为主。杜甫与李白合称“李杜”，为了跟杜甫与李白区别开来，诗人李商隐与杜牧即“小李杜”。");
        eight.setTitle("杜牧简介");
        eight.save();

    }

    private void createBlank(){
        Blank one=new Blank();
        one.setContent("东风不与周郎便，铜雀春深锁二乔。");
        one.setTag("怀古咏史");
        one.save();

        Blank two=new Blank();
        two.setContent("商女不知亡国恨，隔江犹唱后庭花。");
        two.setTag("怀古咏史");
        two.save();

        Blank three=new Blank();
        three.setContent("出师未捷身先死，长使英雄泪满襟。");
        three.setTag("怀古咏史");
        three.save();

        Blank four=new Blank();
        four.setContent("一骑红尘妃子笑，无人知是荔枝来。");
        four.setTag("怀古咏史");
        four.save();

        Blank five=new Blank();
        five.setContent("金戈铁马，气吞万里如虎。");
        five.setTag("怀古咏史");
        five.save();
    }

    private void createShiyi(){

        String[] question1 = {"李白是哪个朝代的诗人？",
                "唐朝",
                "宋朝",
                "元朝",
                "明朝"};
        createQuestion(1, question1, "A");

        String[] question2 = {"杜甫是哪个朝代的诗人？",
                "唐朝",
                "宋朝",
                "元朝",
                "明朝"};
        createQuestion(2, question2, "A");

        String[] question3 = {"被称为“登临怀古双壁”的是哪两首诗",
                "辛弃疾《永遇乐·京口北固亭怀古》 ；苏轼《念奴娇·赤壁怀古》",
                "李白《登金陵凤凰台》；崔颢《黄鹤楼》",
                "崔颢《黄鹤楼》；苏轼《念奴娇·赤壁怀古》",
                "李白《登金陵凤凰台》；辛弃疾《永遇乐·京口北固亭怀古》"};
        createQuestion(3, question3, "B");

        String[] question4 = {"前人曾评价温庭筠的《过陈琳墓》说：“此诗吊陈琳，都用自己陈说，盖己" +
                "之才与遇，有与琳相似者。”诗中哪些词句用以描写自己",
                "曾于青史见遗文，今日飘蓬过此坟。",
                "词客有灵应识我，霸才无主独怜君。",
                "石麟埋没藏春草，铜雀荒凉对暮云。",
                "莫怪临风倍惆怅，欲将书剑学从军。"};
        createQuestion(4, question4, "D");

        String[] question5 = {"对于王安石的《南乡子·自古帝王州》中最后一句“槛外长江空自流”说法不" +
                "正确的一项是",
                "化用了滕王阁诗的“阁中帝子今何在，槛外长江空自流",
                "此句表达的意境与“唯见长江天际流”的意境相似。",
                "“空”字写出了长江奔流不息，从不因任何事而改变的特点。",
                "以景结情，抒发了人生盛衰无常而宇宙永恒的感慨。"};
        createQuestion(5, question5, "B");

    }

    private void createQuestion(int qId, String[] ques, String ans) {

        Question question = new Question();

        question.setQuestionId(qId);
        question.setQuestion(ques[0]);
        question.setOptions(ques[1], ques[2], ques[3], ques[4]);
        question.setAnswer(ans);

        question.save();
    }
}
