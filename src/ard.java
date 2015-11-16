// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class ard
    implements ang, Serializable
{

    private static AtomicReference a = new AtomicReference(null);
    private static final long serialVersionUID = 1L;

    public ard()
    {
    }

    public static int a(int i, arf arf1, cuy cuy1)
    {
        if (i == -1 || arf1 == null)
        {
            eev.f("Babel", "OzChatAclSettings.setRemote: empty account or acl");
            return -1;
        }
        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("OzChatAclSettings.setRemote:aclType=");
            String s1 = String.valueOf(cuy1);
            String s2 = arf1.b;
            String s3 = arf1.c;
            String s4 = arf1.d;
            eev.c("Babel", (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(s1).append(",circleId=").append(s2).append(",circleName=").append(s3).append(",newLevel=").append(s4).toString());
        }
        return RealTimeChatService.a(i, cuy1, arf1.b, arf1.c, arf1.d);
    }

    public static int a(String s)
    {
        if (TextUtils.equals("RING", s))
        {
            return 50;
        }
        if (TextUtils.equals("INVITE", s))
        {
            return 20;
        }
        return !TextUtils.equals("BLOCKED", s) ? 0 : 10;
    }

    private static arf a(String s, String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        Object aobj[];
        if (!s1.startsWith(s))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        aobj = s1.substring(s.length() + 1).split("_");
        if (aobj.length <= 1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        s = Base64.decode(aobj[0], 2);
        aobj = Base64.decode(aobj[1], 2);
        if (s == null || aobj == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        s = new arf(s1, new String(s, "UTF-8"), new String(((byte []) (aobj)), "UTF-8"));
        return s;
        s;
        return null;
    }

    private static hm a(grb grb1)
    {
        int i = 0;
        hm hm1 = new hm();
        grb1 = grb1.e("chat_acl_settings_circle");
        for (int j = grb1.a("count", 0); i < j; i++)
        {
            grb grb2 = grb1.e(Integer.toString(i));
            arf arf1 = new arf(null, grb2.b("id"), grb2.b("name"));
            arf1.d = grb2.b("level");
            hm1.put(arf1.b, arf1);
        }

        return hm1;
    }

    private static String a(int i, String s)
    {
        return ((gqz)hlp.a(g.nU, gqz)).a(i).a(s, "INVITE");
    }

    public static void a(int i)
    {
        if (i == -1)
        {
            eev.f("Babel", "OzChatAclSettings.syncRemote: empty account");
            return;
        } else
        {
            eev.c("Babel", (new StringBuilder(53)).append("OzChatAclSettings.syncRemote: syncing for ").append(i).toString());
            RealTimeChatService.d(i);
            return;
        }
    }

    public static void a(int i, int j, int k, int l, List list)
    {
        grd grd1 = ((gqz)hlp.a(g.nU, gqz)).b(i);
        Object obj = f(j);
        boolean flag = a(grd1, "chat_acl_settings_public", grd1.a("chat_acl_settings_public", ""), ((String) (obj)));
        obj = f(k);
        boolean flag1 = a(grd1, "chat_acl_settings_phone", grd1.a("chat_acl_settings_phone", ""), ((String) (obj)));
        obj = f(l);
        i = a(grd1, "chat_acl_settings_email", grd1.a("chat_acl_settings_email", ""), ((String) (obj))) | (flag | false | flag1);
        obj = a(((grb) (grd1)));
        int i1 = ((hm) (obj)).size();
        grd grd2 = grd1.i("chat_acl_settings_circle");
        if (list != null)
        {
            list = list.iterator();
            j = 0;
            do
            {
                k = j;
                l = i;
                if (!list.hasNext())
                {
                    break;
                }
                Object obj1 = (cyk)list.next();
                if (!TextUtils.isEmpty(((cyk) (obj1)).a) && !TextUtils.isEmpty(((cyk) (obj1)).b))
                {
                    arf arf1 = (arf)((hm) (obj)).get(((cyk) (obj1)).a);
                    String s1 = f(((cyk) (obj1)).c);
                    if (arf1 == null || !((cyk) (obj1)).b.equals(arf1.c) || !s1.equals(arf1.d))
                    {
                        i = 1;
                    }
                    grd2.g(Integer.toString(j)).b("id", ((cyk) (obj1)).a).b("name", ((cyk) (obj1)).b).b("level", s1);
                    j++;
                } else
                {
                    String s = String.valueOf("OzChatAclSettings.save: received empty circle id or name:circleId=");
                    String s2 = ((cyk) (obj1)).a;
                    obj1 = ((cyk) (obj1)).b;
                    eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s2).length() + String.valueOf(obj1).length())).append(s).append(s2).append(", circleName=").append(((String) (obj1))).toString());
                }
            } while (true);
        } else
        {
            k = 0;
            l = i;
        }
        grd2.b("count", k);
        if (k < i1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        for (; k < i1; k++)
        {
            grd2.g(Integer.toString(k)).f("id").f("name").f("level");
        }

        if ((i | l) != 0)
        {
            grd1.d();
            list = (arg)a.get();
            if (list != null)
            {
                list.A_();
            }
        }
    }

    public static void a(arg arg1)
    {
        a.set(arg1);
    }

    private static boolean a(grd grd1, String s, String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
            if (!TextUtils.equals(s2, s1))
            {
                grd1.b(s, s2);
                flag = true;
            }
        }
        return flag;
    }

    public static List b(int i)
    {
        ArrayList arraylist = new ArrayList();
        grb grb1 = ((gqz)hlp.a(g.nU, gqz)).a(i).e("chat_acl_settings_circle");
        int k = grb1.a("count", 0);
        for (int j = 0; j < k; j++)
        {
            grb grb2 = grb1.e(Integer.toString(j));
            Object obj = String.valueOf("chat_acl_settings_circle");
            String s = String.valueOf("level");
            obj = new arf((new StringBuilder(String.valueOf(obj).length() + 25 + String.valueOf(s).length())).append(i).append(".").append(((String) (obj))).append(".").append(j).append(".").append(s).toString(), grb2.b("id"), grb2.b("name"));
            obj.d = grb2.b("level");
            arraylist.add(obj);
        }

        return arraylist;
    }

    public static void b(int i, arf arf1, cuy cuy1)
    {
        hm hm1;
        int j;
        int k;
        int l;
        grb grb1 = ((gqz)hlp.a(g.nU, gqz)).a(i);
        hm1 = a(grb1);
        l = a(grb1.a("chat_acl_settings_public", ""));
        k = a(grb1.a("chat_acl_settings_phone", ""));
        j = a(grb1.a("chat_acl_settings_email", ""));
        are.a[cuy1.ordinal()];
        JVM INSTR tableswitch 1 4: default 112
    //                   1 199
    //                   2 211
    //                   3 223
    //                   4 235;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        arf1 = new ArrayList();
        for (int i1 = 0; i1 < hm1.size(); i1++)
        {
            cuy1 = (arf)hm1.c(i1);
            cyk cyk1 = new cyk();
            cyk1.b = ((arf) (cuy1)).c;
            cyk1.a = ((arf) (cuy1)).b;
            cyk1.c = a(((arf) (cuy1)).d);
            arf1.add(cyk1);
        }

        break; /* Loop/switch isn't completed */
_L2:
        l = a(arf1.d);
        continue; /* Loop/switch isn't completed */
_L3:
        k = a(arf1.d);
        continue; /* Loop/switch isn't completed */
_L4:
        j = a(arf1.d);
        continue; /* Loop/switch isn't completed */
_L5:
        hm1.put(arf1.b, arf1);
        if (true) goto _L1; else goto _L6
_L6:
        a(i, l, k, j, arf1);
        return;
    }

    public static void b(arg arg1)
    {
        a.compareAndSet(arg1, null);
    }

    public static String c(int i)
    {
        return a(i, "chat_acl_settings_public");
    }

    public static String d(int i)
    {
        return a(i, "chat_acl_settings_phone");
    }

    public static String e(int i)
    {
        return a(i, "chat_acl_settings_email");
    }

    private static String f(int i)
    {
        if (i == 20)
        {
            return "INVITE";
        }
        if (i == 50)
        {
            return "RING";
        }
        if (i == 10)
        {
            return "BLOCKED";
        } else
        {
            return null;
        }
    }

    public void a(grd grd1, SharedPreferences sharedpreferences, android.content.SharedPreferences.Editor editor)
    {
        ArrayList arraylist = new ArrayList();
        sharedpreferences = sharedpreferences.getAll();
        if (sharedpreferences != null)
        {
            sharedpreferences = sharedpreferences.entrySet().iterator();
            do
            {
                if (!sharedpreferences.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)sharedpreferences.next();
                arf arf1 = a("chat_acl_settings_circle", (String)entry.getKey());
                if (arf1 != null)
                {
                    arf1.d = (String)entry.getValue();
                    arraylist.add(arf1);
                    editor.remove((String)entry.getKey());
                }
            } while (true);
        }
        grd1 = grd1.g("chat_acl_settings_circle");
        grd1.b("count", arraylist.size());
        for (int i = 0; i < arraylist.size(); i++)
        {
            sharedpreferences = (arf)arraylist.get(i);
            grd1.g(Integer.toString(i)).b("id", ((arf) (sharedpreferences)).b).b("name", ((arf) (sharedpreferences)).c).b("level", ((arf) (sharedpreferences)).d);
        }

    }

}
