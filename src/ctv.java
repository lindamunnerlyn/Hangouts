// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpContent;
import java.util.Iterator;
import java.util.List;

public class ctv extends cui
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final String j;
    public final String k;

    public ctv(String s, int i, int l, String s1, List list, String s2)
    {
        gbh.a(aoe.a(s));
        j = s;
        a = i;
        b = l;
        c = s1;
        d = list;
        k = s2;
        s = d.iterator();
        do
        {
            if (!s.hasNext())
            {
                break MISSING_BLOCK_LABEL_426;
            }
            s1 = (ceu)s.next();
            StringBuilder stringbuilder;
            if (((ceu) (s1)).d == null && TextUtils.isEmpty(((ceu) (s1)).g))
            {
                s = "CCR invitee should not have empty fallback name.";
                break MISSING_BLOCK_LABEL_96;
            }
            s1 = s1.b();
        } while (s1 == null || !s1.startsWith("g:"));
        s = "CCR invitee gaiaId should not start with g:.";
_L2:
        if (s != null)
        {
            s1 = new StringBuilder();
            s1.append(s).append(" ");
            s1.append("Invitees: ");
            list = d.iterator();
            while (list.hasNext()) 
            {
                s2 = (ceu)list.next();
                s1.append("[");
                s1.append("g:").append(s2.b()).append(",");
                s1.append("ch:").append(s2.c()).append(",");
                s1.append("ci:").append(((ceu) (s2)).d).append(",");
                stringbuilder = s1.append("p:");
                s = ((ceu) (s2)).c;
                if (!TextUtils.isEmpty(s))
                {
                    i = s.length();
                    if (4 >= i)
                    {
                        s = g.c("x", i);
                    } else
                    {
                        String s3 = String.valueOf(g.c("x", i - 4));
                        s = String.valueOf(s.substring(i - 4, i));
                        if (s.length() != 0)
                        {
                            s = s3.concat(s);
                        } else
                        {
                            s = new String(s3);
                        }
                    }
                }
                stringbuilder.append(s).append(",");
                stringbuilder = s1.append("fallback:");
                if (TextUtils.isEmpty(((ceu) (s2)).g))
                {
                    s = "unset";
                } else
                {
                    s = "set";
                }
                stringbuilder.append(s);
                s1.append("] ");
            }
            gbh.a(s1.toString());
        }
        return;
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ctv(String s, int i, String s1, List list)
    {
        this(s, i, 0, s1, list, null);
    }

    public String a()
    {
        return "event_queue";
    }

    public kop a(String s, int i, int l)
    {
        Object obj;
        if (ebw.a("Babel_RequestWriter", 3))
        {
            obj = String.valueOf(c);
            Iterator iterator;
            String s1;
            if (((String) (obj)).length() != 0)
            {
                obj = "ConversationRequest build protobuf: name=".concat(((String) (obj)));
            } else
            {
                obj = new String("ConversationRequest build protobuf: name=");
            }
            ebw.d("Babel_RequestWriter", ((String) (obj)));
        }
        obj = new iro();
        obj.requestHeader = ctq.a(s, i, l, h);
        obj.a = Integer.valueOf(a);
        obj.c = aoe.c(j);
        if (c != null)
        {
            obj.d = c;
        }
        if (d != null)
        {
            i = d.size();
        } else
        {
            i = 0;
        }
        if (i > 0)
        {
            obj.f = new ius[i];
            s = d.iterator();
            int i1 = 0;
            while (s.hasNext()) 
            {
                ceu ceu1 = (ceu)s.next();
                ius ius1 = g.a(ceu1, b);
                if (ceu1.B != null)
                {
                    i = ceu1.B.size() + 0;
                } else
                {
                    i = 0;
                }
                l = i;
                if (ceu1.A != null)
                {
                    l = i + ceu1.A.size();
                }
                i = l + 1;
                if (i > 0)
                {
                    ius1.f = new iut[i];
                    if (ceu1.B != null)
                    {
                        iterator = ceu1.B.iterator();
                        l = 0;
                        do
                        {
                            i = l;
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            s1 = (String)iterator.next();
                            ius1.f[l] = new iut();
                            ius1.f[l].b = new iuu();
                            ius1.f[l].b.a = s1;
                            l++;
                        } while (true);
                    } else
                    {
                        i = 0;
                    }
                    l = i;
                    if (ceu1.A != null)
                    {
                        Iterator iterator1 = ceu1.A.iterator();
                        do
                        {
                            l = i;
                            if (!iterator1.hasNext())
                            {
                                break;
                            }
                            String s2 = (String)iterator1.next();
                            ius1.f[i] = new iut();
                            ius1.f[i].a = new iuw();
                            ius1.f[i].a.a = new jtj();
                            ius1.f[i].a.a.a = s2;
                            i++;
                        } while (true);
                    }
                    ius1.f[l] = new iut();
                    ius1.f[l].c = new iuv();
                    if (!TextUtils.isEmpty(ceu1.C))
                    {
                        ius1.f[l].c.a = ceu1.C;
                    } else
                    if (!TextUtils.isEmpty(ceu1.e))
                    {
                        ius1.f[l].c.a = ceu1.e;
                    } else
                    {
                        ius1.f[l].c.a = "unknown person";
                    }
                }
                ((iro) (obj)).f[i1] = ius1;
                i1++;
            }
        }
        if (!TextUtils.isEmpty(k))
        {
            s = new iup();
            s.a = k;
            obj.h = s;
        }
        return ((kop) (obj));
    }

    public void a(ani ani, dbo dbo1)
    {
        boolean flag;
        if (dbo1.c() == 111)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        RealTimeChatService.a(ani, j, flag);
    }

    public HttpContent b(String s, int i, int l)
    {
        s = a(s, i, l);
        if (s != null)
        {
            this.i = s.toString();
        }
        return new csj(s);
    }

    protected String f()
    {
        String s = String.valueOf(g());
        if (s.length() != 0)
        {
            return "https://www.googleapis.com/chat/v1android/".concat(s);
        } else
        {
            return new String("https://www.googleapis.com/chat/v1android/");
        }
    }

    public String g()
    {
        return "conversations/createconversation";
    }
}
