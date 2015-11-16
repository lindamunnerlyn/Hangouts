// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class asz
    implements asm, hon, hop, hov, hoy, hoz
{

    final Context a;
    final int b;
    final hlp c;
    final aii d;
    final atu e;
    gqu f;
    amx g;
    final ast h = new atc(this);
    private final ad i;
    private boolean j;
    private gvc k;
    private aot l;
    private boolean m;
    private String n;
    private int o;
    private final asq p;
    private final asj q;
    private final ass r;
    private asr s;
    private final asl t = new atb(this);
    private final gvb u = new atd(this);

    asz(Context context, hof hof1, int i1, ad ad1, aii aii1, atu atu1)
    {
        s = new ata(this);
        n.b(aii1, "Can't create ConversationCreator with null participants model.");
        String s1 = String.valueOf(atu1);
        eev.c("Babel_ConvCreator", (new StringBuilder(String.valueOf(s1).length() + 53)).append("Conversation creator created with conversation type: ").append(s1).toString());
        i = ad1;
        context = new hlt(context);
        a = context;
        b = i1;
        d = aii1;
        e = atu1;
        c = context.getBinder();
        c.a(asr, s);
        c.a(asl, t);
        c.a(ast, h);
        k = (gvc)c.a(gvc);
        k.a(u);
        f = (gqu)c.a(gqu);
        hof1.a(this);
        p = ((asp)c.a(asp)).a(a, hof1, i1);
        q = ((asp)c.a(asp)).a(a, hof1, i1, ad1.getFragmentManager());
        r = ((asp)c.a(asp)).a(a, hof1, ad1.getFragmentManager());
    }

    static ail a(amx amx1, ask ask1)
    {
        if (ask1.b != null)
        {
            ask1 = dbl.a(ask1.b.b());
        } else
        {
            ask1 = dbl.a(ask1.a.a(), amx1.e());
        }
        ask1 = ail.a(ask1, amx1.e(), amx1.f());
        if (amx1.d() != null)
        {
            for (Iterator iterator = amx1.d().iterator(); iterator.hasNext(); ask1.b(((amv)iterator.next()).b())) { }
        }
        if (amx1.b() != null)
        {
            for (Iterator iterator1 = amx1.b().iterator(); iterator1.hasNext(); ask1.c(((and)iterator1.next()).b())) { }
        }
        ask1.a(amx1.a);
        return ask1;
    }

    static void a(asz asz1)
    {
        boolean flag2 = g.a(asz1.g, asz1.e);
        if (flag2)
        {
            Context context = asz1.a;
            amx amx1 = asz1.g;
            int i1 = ((gqu)hlp.a(context, gqu)).a();
            boolean flag3 = ((ahd)hlp.a(context, ahd)).a(i1);
            boolean flag;
            boolean flag1;
            if (!amx1.b().isEmpty() && (flag3 || eey.b()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!amx1.d().isEmpty())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                String s1 = asz1.a.getString(g.jI, new Object[] {
                    asz1.g.e()
                });
                Toast.makeText(asz1.a, s1, 0).show();
                asz1.a(false);
                return;
            }
        }
        asz1.q.a(asz1.g, asz1.e, flag2);
    }

    static void a(asz asz1, int i1)
    {
        dbt dbt1;
        int k1;
        boolean flag1;
        flag1 = true;
        dbt1 = (dbt)hlp.a(asz1.a, dbt);
        k1 = asz1.f.a();
        if (asz1.e != atu.c) goto _L2; else goto _L1
_L1:
        Iterator iterator = asz1.d.d().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(((ail)iterator.next()).b().d)) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L12:
        if (!flag) goto _L2; else goto _L7
_L7:
        if (!dbt1.b(asz1.a) || dcn.e(k1).o()) goto _L9; else goto _L8
_L8:
        aoa aoa1;
        Object obj2;
        if (asz1.d.e() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gdv.a("Audio calling to multiple phone numbers is not supported", flag1);
        eev.c("Babel_ConvCreator", "Making outbound audio call");
        aoa1 = dcn.e(asz1.f.a());
        obj2 = (ail)asz1.d.d().get(0);
        obj2 = new ddg(2, ((ail) (obj2)).b().d, null, 0, ((ail) (obj2)).d(), ((ail) (obj2)).g(), null, 120);
        g.a(asz1.i.getActivity(), ((ddg) (obj2)), aoa1.h(), aoa1.a());
_L10:
        ((asn)asz1.c.a(asn)).a(null);
        return;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L9:
        if (eey.b())
        {
            if (asz1.d.e() != 1)
            {
                flag1 = false;
            }
            gdv.a("Audio calling to multiple phone numbers is not supported", flag1);
            asz1.a.startActivity(g.a(asz1.a, ((ail)asz1.d.d().get(0)).b().d));
        } else
        {
            Object obj = (all)hlp.b(asz1.a, all);
            if (obj != null)
            {
                obj = ((all) (obj)).a(asz1.a);
                asz1.a.startActivity(((android.content.Intent) (obj)));
            }
        }
        if (true) goto _L10; else goto _L2
_L2:
        eev.c("Babel_ConvCreator", "Conversation creation background task started");
        if (asz1.e == atu.b && asz1.d.e() > 1 && i1 == 2)
        {
            ((gdd)asz1.c.a(gdd)).a(k1).a(2711).d();
        }
        Object obj1 = (asp)asz1.c.a(asp);
        String s1 = String.valueOf("conversation_creation");
        int j1 = asz1.b;
        obj1 = ((asp) (obj1)).a((new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(j1).toString(), k1, asz1.d.a(), asz1.l, asz1.e, i1, asz1.m, asz1.n, asz1.o);
        asz1.k.b(((guy) (obj1)));
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void a(asz asz1, String s1)
    {
        Object obj;
        Context context;
        ap ap;
        String s2;
        n.b(s1, "Shouldn't attempt to send invite with null invite string");
        obj = String.valueOf(eev.b(s1));
        if (((String) (obj)).length() != 0)
        {
            obj = "Invite dialog shown or invite sent to ".concat(((String) (obj)));
        } else
        {
            obj = new String("Invite dialog shown or invite sent to ");
        }
        eev.c("Babel_ConvCreator", ((String) (obj)));
        obj = (bxg)asz1.c.a(bxg);
        context = asz1.a;
        ap = asz1.i.getFragmentManager();
        s2 = asz1.g.e();
        asz1 = asz1.e;
        bxh.a[asz1.ordinal()];
        JVM INSTR tableswitch 1 3: default 112
    //                   1 188
    //                   2 169
    //                   3 195;
           goto _L1 _L2 _L3 _L4
_L1:
        asz1 = String.valueOf(asz1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(asz1).length() + 30)).append("Unexpected conversation type: ").append(asz1).toString());
_L3:
        asz1 = bxi.f;
_L6:
        ((bxg) (obj)).a(context, ap, s2, s1, null, asz1);
        return;
_L2:
        asz1 = bxi.c;
        continue; /* Loop/switch isn't completed */
_L4:
        asz1 = bxi.b;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String a()
    {
        String s1 = String.valueOf(getClass().getName());
        int i1 = b;
        return (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString();
    }

    public void a(amx amx1)
    {
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Should not add new contact after conversation has been created.");
        if (g != null)
        {
            amx1 = String.valueOf(amx1);
            eev.c("Babel_ConvCreator", (new StringBuilder(String.valueOf(amx1).length() + 65)).append("addContact for ").append(amx1).append(" skipped because previous addition hasn't finished").toString());
            ((asn)c.a(asn)).a(false);
            return;
        }
        String s1 = String.valueOf(amx1.toString());
        if (s1.length() != 0)
        {
            s1 = "addContact called with ".concat(s1);
        } else
        {
            s1 = new String("addContact called with ");
        }
        eev.c("Babel_ConvCreator", s1);
        g = amx1;
        p.a(amx1, e);
    }

    public void a(Bundle bundle)
    {
label0:
        {
            if (bundle != null)
            {
                eev.c("Babel_ConvCreator", "Conversation creator restored from saved state");
                if (bundle.getBoolean("creation_completed"))
                {
                    break label0;
                }
                g = (amx)bundle.getSerializable("current_contact");
                l = (aot)bundle.getSerializable("lookup_mode");
                m = bundle.getBoolean("force_group_conversation");
                n = bundle.getString("invite_token_url");
                o = bundle.getInt("impression_id");
            }
            return;
        }
        eev.c("Babel_ConvCreator", "Not restoring instance state since the last creation was completed.");
    }

    public void a(aot aot1, int i1)
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
        eev.c("Babel_ConvCreator", "create called without known conversationId");
        l = aot1;
        m = false;
        n = null;
        o = i1;
        aot1 = (dup)c.a(dup);
        if (e == atu.b && eey.d() && aot1.g().equals("auto") && aot1.c() && d.d().size() == 1)
        {
            g.a(new ate(this));
            return;
        } else
        {
            r.a(e, d.d());
            return;
        }
    }

    public void a(String s1, int i1)
    {
        boolean flag1 = false;
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
        flag = flag1;
        if (g == null)
        {
            flag = true;
        }
        n.b(flag, "Contact adding should be finished before creating conversation");
        s2 = String.valueOf(eev.b(s1));
        if (s2.length() != 0)
        {
            s2 = "create called with existing conversationId ".concat(s2);
        } else
        {
            s2 = new String("create called with existing conversationId ");
        }
        eev.c("Babel_ConvCreator", s2);
        ((gdd)c.a(gdd)).a(f.a()).a(i1).d();
        ((asn)c.a(asn)).a(s1);
        b(true);
    }

    void a(boolean flag)
    {
        g = null;
        ((asn)c.a(asn)).a(flag);
    }

    public void b(amx amx1)
    {
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "Should not remove contact after conversation has been created.");
        if (g != null)
        {
            amx1 = String.valueOf(amx1);
            eev.c("Babel_ConvCreator", (new StringBuilder(String.valueOf(amx1).length() + 68)).append("removeContact for ").append(amx1).append(" skipped because previous addition hasn't finished").toString());
            return;
        }
        String s1 = String.valueOf(amx1.toString());
        if (s1.length() != 0)
        {
            s1 = "removeContact called with ".concat(s1);
        } else
        {
            s1 = new String("removeContact called with ");
        }
        eev.c("Babel_ConvCreator", s1);
        d.a(amx1);
    }

    public void b(Bundle bundle)
    {
        eev.c("Babel_ConvCreator", "Saving state of conversation creator");
        bundle.putSerializable("current_contact", g);
        bundle.putBoolean("creation_completed", j);
        bundle.putSerializable("lookup_mode", l);
        bundle.putBoolean("force_group_conversation", m);
        bundle.putString("invite_token_url", n);
        bundle.putInt("impression_id", o);
    }

    void b(boolean flag)
    {
        j = flag;
        if (flag)
        {
            k.b(u);
        }
    }

    public void f_()
    {
        k.b(u);
    }
}
