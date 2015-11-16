// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ask
    implements arx, fsn, hjt, hjv, hkb, hke
{

    final Context a;
    final int b;
    final hgx c;
    final aip d;
    final atd e;
    gmo f;
    amf g;
    final ase h = new asn(this);
    private final ad i;
    private boolean j;
    private gqr k;
    private aob l;
    private boolean m;
    private String n;
    private int o;
    private final asb p;
    private final aru q;
    private final asd r;
    private asc s;
    private final arw t = new asm(this);
    private final gqq u = new aso(this);

    ask(Context context, hjm hjm1, int i1, ad ad1, aip aip1, atd atd1)
    {
        s = new asl(this);
        n.b(aip1, "Can't create ConversationCreator with null participants model.");
        String s1 = String.valueOf(atd1);
        ebw.c("Babel_ConvCreator", (new StringBuilder(String.valueOf(s1).length() + 53)).append("Conversation creator created with conversation type: ").append(s1).toString());
        i = ad1;
        context = new hhb(context);
        a = context;
        b = i1;
        d = aip1;
        e = atd1;
        c = context.getBinder();
        c.a(asc, s);
        c.a(arw, t);
        c.a(ase, h);
        k = (gqr)c.a(gqr);
        k.a(u);
        f = (gmo)c.a(gmo);
        hjm1.a(this);
        p = ((asa)c.a(asa)).a(a, hjm1, i1);
        q = ((asa)c.a(asa)).a(a, hjm1, i1, ad1.getFragmentManager());
        r = ((asa)c.a(asa)).a(a, hjm1, ad1.getFragmentManager());
    }

    static ais a(amf amf1, arv arv1)
    {
        if (arv1.b != null)
        {
            arv1 = daf.a(arv1.b.b());
        } else
        {
            arv1 = daf.a(arv1.a.a(), amf1.e());
        }
        arv1 = ais.a(arv1, amf1.e(), amf1.f());
        if (amf1.d() != null)
        {
            for (Iterator iterator = amf1.d().iterator(); iterator.hasNext(); arv1.b(((amd)iterator.next()).b())) { }
        }
        if (amf1.b() != null)
        {
            for (Iterator iterator1 = amf1.b().iterator(); iterator1.hasNext(); arv1.c(((aml)iterator1.next()).b())) { }
        }
        arv1.a(amf1.a);
        return arv1;
    }

    static void a(ask ask1)
    {
        ask1.q.a(ask1.g, ask1.e, bwn.a(ask1.g, ask1.e));
    }

    static void a(ask ask1, int i1)
    {
        dan dan1;
        int k1;
        boolean flag1;
        flag1 = true;
        dan1 = (dan)hgx.a(ask1.a, dan);
        k1 = ask1.f.a();
        if (ask1.e != atd.c) goto _L2; else goto _L1
_L1:
        Iterator iterator = ask1.d.d().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(((ais)iterator.next()).b().d)) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L12:
        if (!flag) goto _L2; else goto _L7
_L7:
        if (!dan1.b(ask1.a) || dbf.e(k1).q()) goto _L9; else goto _L8
_L8:
        ani ani1;
        Object obj2;
        if (ask1.d.e() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gbh.a("Audio calling to multiple phone numbers is not supported", flag1);
        ebw.c("Babel_ConvCreator", "Making outbound audio call");
        ani1 = dbf.e(ask1.f.a());
        obj2 = (ais)ask1.d.d().get(0);
        obj2 = new dbx(2, ((ais) (obj2)).b().d, null, 0, ((ais) (obj2)).d(), ((ais) (obj2)).g(), null, 120);
        g.a(ask1.i.getActivity(), ((dbx) (obj2)), ani1.h(), ani1.a());
_L10:
        ((ary)ask1.c.a(ary)).a(null);
        return;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L9:
        if (ebz.b())
        {
            if (ask1.d.e() != 1)
            {
                flag1 = false;
            }
            gbh.a("Audio calling to multiple phone numbers is not supported", flag1);
            ask1.a.startActivity(g.a(ask1.a, ((ais)ask1.d.d().get(0)).b().d));
        } else
        {
            Object obj = (alo)hgx.b(ask1.a, alo);
            if (obj != null)
            {
                obj = ((alo) (obj)).a(ask1.a);
                ask1.a.startActivity(((android.content.Intent) (obj)));
            }
        }
        if (true) goto _L10; else goto _L2
_L2:
        ebw.c("Babel_ConvCreator", "Conversation creation background task started");
        if (ask1.e == atd.b && ask1.d.e() > 1 && i1 == 2)
        {
            ((bwf)ask1.c.a(bwf)).a(k1, 2711).d();
        }
        Object obj1 = (asa)ask1.c.a(asa);
        String s1 = String.valueOf("conversation_creation");
        int j1 = ask1.b;
        obj1 = ((asa) (obj1)).a((new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(j1).toString(), k1, ask1.d.a(), ask1.l, ask1.e, i1, ask1.m, ask1.n, ask1.o);
        ask1.k.b(((gqn) (obj1)));
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void a(ask ask1, String s1)
    {
        ani ani1;
        String s2;
        n.b(s1, "Shouldn't attempt to send invite with null invite string");
        Object obj = String.valueOf(ebw.b(s1));
        if (((String) (obj)).length() != 0)
        {
            obj = "Invite dialog shown or invite sent to ".concat(((String) (obj)));
        } else
        {
            obj = new String("Invite dialog shown or invite sent to ");
        }
        ebw.c("Babel_ConvCreator", ((String) (obj)));
        ani1 = dbf.e(ask1.f.a());
        s2 = ask1.g.e();
        obj = ask1.e;
        bwo.a[((atd) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 104
    //                   1 193
    //                   2 161
    //                   3 200
    //                   4 207;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        ask1 = String.valueOf(obj);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(ask1).length() + 27)).append("Unknown conversation type: ").append(ask1).toString());
_L3:
        bwr bwr1 = bwr.f;
_L7:
        (new bwn(ani1, s2, s1, null, bwr1, ask1.a)).a(ask1.i.getFragmentManager());
        return;
_L2:
        bwr1 = bwr.c;
        continue; /* Loop/switch isn't completed */
_L4:
        bwr1 = bwr.b;
        continue; /* Loop/switch isn't completed */
_L5:
        bwr1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String a()
    {
        String s1 = String.valueOf(getClass().getName());
        int i1 = b;
        return (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString();
    }

    public void a(amf amf1)
    {
        boolean flag1 = true;
        String s1;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Should not add new contact after conversation has been created.");
        if (g == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n.b(flag, "Should not have a current contact when adding a new one");
        s1 = String.valueOf(amf1.toString());
        if (s1.length() != 0)
        {
            s1 = "addContact called with ".concat(s1);
        } else
        {
            s1 = new String("addContact called with ");
        }
        ebw.c("Babel_ConvCreator", s1);
        g = amf1;
        p.a(amf1, e);
    }

    public void a(Bundle bundle)
    {
label0:
        {
            if (bundle != null)
            {
                ebw.c("Babel_ConvCreator", "Conversation creator restored from saved state");
                if (bundle.getBoolean("creation_completed"))
                {
                    break label0;
                }
                g = (amf)bundle.getSerializable("current_contact");
                l = (aob)bundle.getSerializable("lookup_mode");
                m = bundle.getBoolean("force_group_conversation");
                n = bundle.getString("invite_token_url");
                o = bundle.getInt("impression_id");
            }
            return;
        }
        ebw.c("Babel_ConvCreator", "Not restoring instance state since the last creation was completed.");
    }

    public void a(aob aob1, int i1)
    {
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Can't create conversation more than once.");
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Contact adding should be finished before creating conversation");
        ebw.c("Babel_ConvCreator", "create called without known conversationId");
        l = aob1;
        m = false;
        n = null;
        o = i1;
        aob1 = (drw)c.a(drw);
        if (e == atd.b && ebz.d() && aob1.f().equals("auto") && aob1.b() && d.d().size() == 1)
        {
            g.a(new asp(this));
            return;
        } else
        {
            r.a(e, d.d());
            return;
        }
    }

    public void a(String s1, int i1)
    {
        boolean flag1 = true;
        String s2;
        boolean flag;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag, "Create called with empty conversation ID");
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Can't create conversation more than once");
        if (g == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n.b(flag, "Contact adding should be finished before creating conversation");
        s2 = String.valueOf(ebw.b(s1));
        if (s2.length() != 0)
        {
            s2 = "create called with existing conversationId ".concat(s2);
        } else
        {
            s2 = new String("create called with existing conversationId ");
        }
        ebw.c("Babel_ConvCreator", s2);
        ((bwf)c.a(bwf)).a(f.a(), i1).d();
        ((ary)c.a(ary)).a(s1);
        b();
    }

    void b()
    {
        j = true;
        k.b(u);
    }

    public void b(amf amf1)
    {
        boolean flag1 = true;
        String s1;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Should not remove contact after conversation has been created.");
        if (g == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n.b(flag, "Should not have a current contact when removing a new one");
        s1 = String.valueOf(amf1.toString());
        if (s1.length() != 0)
        {
            s1 = "removeContact called with ".concat(s1);
        } else
        {
            s1 = new String("removeContact called with ");
        }
        ebw.c("Babel_ConvCreator", s1);
        d.a(amf1);
    }

    public void b(Bundle bundle)
    {
        ebw.c("Babel_ConvCreator", "Saving state of conversation creator");
        bundle.putSerializable("current_contact", g);
        bundle.putBoolean("creation_completed", j);
        bundle.putSerializable("lookup_mode", l);
        bundle.putBoolean("force_group_conversation", m);
        bundle.putString("invite_token_url", n);
        bundle.putInt("impression_id", o);
    }

    public void e_()
    {
        k.b(u);
    }
}
