// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.HttpContent;
import java.util.Iterator;
import java.util.List;

public class cvz extends cwm
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final String j;
    public final String k;

    public cvz(String s, int i, int l, String s1, List list, String s2)
    {
        gdv.a("Expected condition to be true", aow.a(s));
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
                break MISSING_BLOCK_LABEL_428;
            }
            s1 = (cfz)s.next();
            StringBuilder stringbuilder;
            if (((cfz) (s1)).d == null && TextUtils.isEmpty(((cfz) (s1)).g))
            {
                s = "CCR invitee should not have empty fallback name.";
                break MISSING_BLOCK_LABEL_98;
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
                s2 = (cfz)list.next();
                s1.append("[");
                s1.append("g:").append(s2.b()).append(",");
                s1.append("ch:").append(s2.c()).append(",");
                s1.append("ci:").append(((cfz) (s2)).d).append(",");
                stringbuilder = s1.append("p:");
                s = ((cfz) (s2)).c;
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
                if (TextUtils.isEmpty(((cfz) (s2)).g))
                {
                    s = "unset";
                } else
                {
                    s = "set";
                }
                stringbuilder.append(s);
                s1.append("] ");
            }
            gdv.a(s1.toString());
        }
        return;
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public cvz(String s, int i, String s1, List list)
    {
        this(s, i, 0, s1, list, null);
    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int l)
    {
        Object obj;
        if (eev.a("Babel_RequestWriter", 3))
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
            eev.d("Babel_RequestWriter", ((String) (obj)));
        }
        obj = new ixt();
        obj.requestHeader = cvu.a(s, i, l, h);
        obj.a = Integer.valueOf(a);
        obj.c = aow.c(j);
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
            obj.f = new jax[i];
            s = d.iterator();
            int i1 = 0;
            while (s.hasNext()) 
            {
                cfz cfz1 = (cfz)s.next();
                jax jax1 = g.a(cfz1, b);
                if (cfz1.B != null)
                {
                    i = cfz1.B.size() + 0;
                } else
                {
                    i = 0;
                }
                l = i;
                if (cfz1.A != null)
                {
                    l = i + cfz1.A.size();
                }
                i = l + 1;
                if (i > 0)
                {
                    jax1.f = new jay[i];
                    if (cfz1.B != null)
                    {
                        iterator = cfz1.B.iterator();
                        l = 0;
                        do
                        {
                            i = l;
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            s1 = (String)iterator.next();
                            jax1.f[l] = new jay();
                            jax1.f[l].b = new jaz();
                            jax1.f[l].b.a = s1;
                            l++;
                        } while (true);
                    } else
                    {
                        i = 0;
                    }
                    l = i;
                    if (cfz1.A != null)
                    {
                        Iterator iterator1 = cfz1.A.iterator();
                        do
                        {
                            l = i;
                            if (!iterator1.hasNext())
                            {
                                break;
                            }
                            String s2 = (String)iterator1.next();
                            jax1.f[i] = new jay();
                            jax1.f[i].a = new jbb();
                            jax1.f[i].a.a = new kbm();
                            jax1.f[i].a.a.a = s2;
                            i++;
                        } while (true);
                    }
                    jax1.f[l] = new jay();
                    jax1.f[l].c = new jba();
                    if (!TextUtils.isEmpty(cfz1.C))
                    {
                        jax1.f[l].c.a = cfz1.C;
                    } else
                    if (!TextUtils.isEmpty(cfz1.e))
                    {
                        jax1.f[l].c.a = cfz1.e;
                    } else
                    {
                        jax1.f[l].c.a = "unknown person";
                    }
                }
                ((ixt) (obj)).f[i1] = jax1;
                i1++;
            }
        }
        if (!TextUtils.isEmpty(k))
        {
            s = new jau();
            s.a = k;
            obj.h = s;
        }
        return ((kws) (obj));
    }

    public void a(aoa aoa, dcx dcx1)
    {
        boolean flag;
        if (dcx1.c() == 111)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        RealTimeChatService.a(aoa, j, flag);
    }

    public HttpContent b(String s, int i, int l)
    {
        s = a(s, i, l);
        if (s != null)
        {
            this.i = s.toString();
        }
        return new cum(s);
    }

    public String f()
    {
        return "conversations/createconversation";
    }
}
