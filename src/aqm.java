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

public final class aqm
    implements amo, Serializable
{

    private static AtomicReference a = new AtomicReference(null);
    private static final long serialVersionUID = 1L;

    public aqm()
    {
    }

    public static int a(int i, aqo aqo1, csv csv1)
    {
        if (i == -1 || aqo1 == null)
        {
            ebw.f("Babel", "OzChatAclSettings.setRemote: empty account or acl");
            return -1;
        }
        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("OzChatAclSettings.setRemote:aclType=");
            String s1 = String.valueOf(csv1);
            String s2 = aqo1.b;
            String s3 = aqo1.c;
            String s4 = aqo1.d;
            ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(s1).append(",circleId=").append(s2).append(",circleName=").append(s3).append(",newLevel=").append(s4).toString());
        }
        return RealTimeChatService.a(i, csv1, aqo1.b, aqo1.c, aqo1.d);
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

    private static aqo a(String s, String s1)
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
        s = new aqo(s1, new String(s, "UTF-8"), new String(((byte []) (aobj)), "UTF-8"));
        return s;
        s;
        return null;
    }

    private static hm a(gmu gmu1)
    {
        int i = 0;
        hm hm1 = new hm();
        gmu1 = gmu1.e("chat_acl_settings_circle");
        for (int j = gmu1.a("count", 0); i < j; i++)
        {
            gmu gmu2 = gmu1.e(Integer.toString(i));
            aqo aqo1 = new aqo(null, gmu2.b("id"), gmu2.b("name"));
            aqo1.d = gmu2.b("level");
            hm1.put(aqo1.b, aqo1);
        }

        return hm1;
    }

    private static String a(int i, String s)
    {
        return ((gms)hgx.a(g.nS, gms)).a(i).a(s, "INVITE");
    }

    public static void a(int i)
    {
        if (i == -1)
        {
            ebw.f("Babel", "OzChatAclSettings.syncRemote: empty account");
            return;
        } else
        {
            ebw.c("Babel", (new StringBuilder(53)).append("OzChatAclSettings.syncRemote: syncing for ").append(i).toString());
            RealTimeChatService.d(i);
            return;
        }
    }

    public static void a(int i, int j, int k, int l, List list)
    {
        gmw gmw1 = ((gms)hgx.a(g.nS, gms)).b(i);
        Object obj = f(j);
        boolean flag = a(gmw1, "chat_acl_settings_public", gmw1.a("chat_acl_settings_public", ""), ((String) (obj)));
        obj = f(k);
        boolean flag1 = a(gmw1, "chat_acl_settings_phone", gmw1.a("chat_acl_settings_phone", ""), ((String) (obj)));
        obj = f(l);
        i = a(gmw1, "chat_acl_settings_email", gmw1.a("chat_acl_settings_email", ""), ((String) (obj))) | (flag | false | flag1);
        obj = a(((gmu) (gmw1)));
        int i1 = ((hm) (obj)).size();
        gmw gmw2 = gmw1.i("chat_acl_settings_circle");
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
                Object obj1 = (cwg)list.next();
                if (!TextUtils.isEmpty(((cwg) (obj1)).a) && !TextUtils.isEmpty(((cwg) (obj1)).b))
                {
                    aqo aqo1 = (aqo)((hm) (obj)).get(((cwg) (obj1)).a);
                    String s1 = f(((cwg) (obj1)).c);
                    if (aqo1 == null || !((cwg) (obj1)).b.equals(aqo1.c) || !s1.equals(aqo1.d))
                    {
                        i = 1;
                    }
                    gmw2.g(Integer.toString(j)).b("id", ((cwg) (obj1)).a).b("name", ((cwg) (obj1)).b).b("level", s1);
                    j++;
                } else
                {
                    String s = String.valueOf("OzChatAclSettings.save: received empty circle id or name:circleId=");
                    String s2 = ((cwg) (obj1)).a;
                    obj1 = ((cwg) (obj1)).b;
                    ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s2).length() + String.valueOf(obj1).length())).append(s).append(s2).append(", circleName=").append(((String) (obj1))).toString());
                }
            } while (true);
        } else
        {
            k = 0;
            l = i;
        }
        gmw2.b("count", k);
        if (k < i1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        for (; k < i1; k++)
        {
            gmw2.g(Integer.toString(k)).f("id").f("name").f("level");
        }

        if ((i | l) != 0)
        {
            gmw1.d();
            list = (aqp)a.get();
            if (list != null)
            {
                list.A_();
            }
        }
    }

    public static void a(aqp aqp1)
    {
        a.set(aqp1);
    }

    private static boolean a(gmw gmw1, String s, String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
            if (!TextUtils.equals(s2, s1))
            {
                gmw1.b(s, s2);
                flag = true;
            }
        }
        return flag;
    }

    public static List b(int i)
    {
        ArrayList arraylist = new ArrayList();
        gmu gmu1 = ((gms)hgx.a(g.nS, gms)).a(i).e("chat_acl_settings_circle");
        int k = gmu1.a("count", 0);
        for (int j = 0; j < k; j++)
        {
            gmu gmu2 = gmu1.e(Integer.toString(j));
            Object obj = String.valueOf("chat_acl_settings_circle");
            String s = String.valueOf("level");
            obj = new aqo((new StringBuilder(String.valueOf(obj).length() + 25 + String.valueOf(s).length())).append(i).append(".").append(((String) (obj))).append(".").append(j).append(".").append(s).toString(), gmu2.b("id"), gmu2.b("name"));
            obj.d = gmu2.b("level");
            arraylist.add(obj);
        }

        return arraylist;
    }

    public static void b(int i, aqo aqo1, csv csv1)
    {
        hm hm1;
        int j;
        int k;
        int l;
        gmu gmu1 = ((gms)hgx.a(g.nS, gms)).a(i);
        hm1 = a(gmu1);
        l = a(gmu1.a("chat_acl_settings_public", ""));
        k = a(gmu1.a("chat_acl_settings_phone", ""));
        j = a(gmu1.a("chat_acl_settings_email", ""));
        aqn.a[csv1.ordinal()];
        JVM INSTR tableswitch 1 4: default 112
    //                   1 199
    //                   2 211
    //                   3 223
    //                   4 235;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        aqo1 = new ArrayList();
        for (int i1 = 0; i1 < hm1.size(); i1++)
        {
            csv1 = (aqo)hm1.c(i1);
            cwg cwg1 = new cwg();
            cwg1.b = ((aqo) (csv1)).c;
            cwg1.a = ((aqo) (csv1)).b;
            cwg1.c = a(((aqo) (csv1)).d);
            aqo1.add(cwg1);
        }

        break; /* Loop/switch isn't completed */
_L2:
        l = a(aqo1.d);
        continue; /* Loop/switch isn't completed */
_L3:
        k = a(aqo1.d);
        continue; /* Loop/switch isn't completed */
_L4:
        j = a(aqo1.d);
        continue; /* Loop/switch isn't completed */
_L5:
        hm1.put(aqo1.b, aqo1);
        if (true) goto _L1; else goto _L6
_L6:
        a(i, l, k, j, aqo1);
        return;
    }

    public static void b(aqp aqp1)
    {
        a.compareAndSet(aqp1, null);
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

    public void a(gmw gmw1, SharedPreferences sharedpreferences, android.content.SharedPreferences.Editor editor)
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
                aqo aqo1 = a("chat_acl_settings_circle", (String)entry.getKey());
                if (aqo1 != null)
                {
                    aqo1.d = (String)entry.getValue();
                    arraylist.add(aqo1);
                    editor.remove((String)entry.getKey());
                }
            } while (true);
        }
        gmw1 = gmw1.g("chat_acl_settings_circle");
        gmw1.b("count", arraylist.size());
        for (int i = 0; i < arraylist.size(); i++)
        {
            sharedpreferences = (aqo)arraylist.get(i);
            gmw1.g(Integer.toString(i)).b("id", ((aqo) (sharedpreferences)).b).b("name", ((aqo) (sharedpreferences)).c).b("level", ((aqo) (sharedpreferences)).d);
        }

    }

}
