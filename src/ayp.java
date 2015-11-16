// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.hangouts.views.EasterEggView;
import com.google.android.apps.hangouts.views.FixedParticipantsView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class ayp extends dhy
{

    final avv a;

    ayp(avv avv1)
    {
        a = avv1;
        super();
    }

    private void a(ddo ddo1)
    {
        if (ddo1 == null)
        {
            ddo1 = String.valueOf(avv.m(a).a().h);
            eev.g("Conv", (new StringBuilder(String.valueOf(ddo1).length() + 64)).append("creating conversation with ").append(ddo1).append(" resulting in null ConversationResult").toString());
            return;
        }
        String s = String.valueOf(ddo1.a);
        if (s.length() != 0)
        {
            s = "Switching conversation; clearing text. New id:".concat(s);
        } else
        {
            s = new String("Switching conversation; clearing text. New id:");
        }
        eev.f("Conv", s);
        ddo1 = new aia(ddo1.a, 0);
        ddo1.d = true;
        ddo1.e = true;
        ddo1.f = a.S();
        a.K();
        avv.a(a, ddo1);
    }

    private void b(aoa aoa1, String s, Runnable runnable)
    {
        while (!aoa1.equals(avv.h(a)) || !avv.A(a).containsKey(s)) 
        {
            return;
        }
        if (avv.A(a).size() > 1)
        {
            for (aoa1 = avv.A(a).keySet().iterator(); aoa1.hasNext();)
            {
                runnable = (String)aoa1.next();
                if (!TextUtils.equals(runnable, s))
                {
                    aoa1 = new aia(runnable, 1);
                    avv.a(a, aoa1);
                    return;
                }
            }

            gdv.a("should never get here");
            return;
        } else
        {
            avv.B(a).a(runnable);
            return;
        }
    }

    public void a()
    {
        avv.y(a);
    }

    public void a(int i, aoa aoa1, ddo ddo1, did did1)
    {
        if (i != avv.z(a))
        {
            return;
        } else
        {
            a(ddo1);
            return;
        }
    }

    public void a(int i, aoa aoa1, ddo ddo1, did did1, int j)
    {
        if (eev.a("Conv", 3))
        {
            did1 = String.valueOf(ddo1.a);
            String s = String.valueOf(aoa1);
            eev.c("Conv", (new StringBuilder(String.valueOf(did1).length() + 81 + String.valueOf(s).length())).append("Forked a new conversation ").append(did1).append(" from an existing conversation ").append(j).append(" for account ").append(s).toString());
        }
        if (!aoa1.equals(avv.h(a)))
        {
            return;
        } else
        {
            a(ddo1);
            return;
        }
    }

    public void a(int i, aoa aoa1, did did1)
    {
        aoa1 = did1.c();
        if (aoa1 instanceof cyl)
        {
            aoa1 = (cwg)aoa1.c();
            if (((cwg) (aoa1)).b && !((cwg) (aoa1)).a)
            {
                aoa1 = (ayc)avv.A(a).get(((cwg) (aoa1)).c);
                if (aoa1 != null)
                {
                    aoa1.e = -1;
                }
            }
        }
    }

    public void a(int i, aoa aoa1, dmf dmf, dcx dcx)
    {
        if (dmf instanceof cwg)
        {
            aoa1 = (cwg)dmf;
            if (((cwg) (aoa1)).b && !((cwg) (aoa1)).a)
            {
                aoa1 = (ayc)avv.A(a).get(((cwg) (aoa1)).c);
                if (aoa1 != null)
                {
                    a.L();
                    aoa1.e = -1;
                    eev.e("Conv", "message load timeout");
                }
            }
        } else
        if ((dmf instanceof cvz) && ((cvz)dmf).j.equals(a.O()))
        {
            a.H();
            a.getActivity().q_();
            return;
        }
    }

    public void a(aoa aoa1, String s)
    {
        b(aoa1, s, null);
    }

    public void a(aoa aoa1, String s, cgd cgd1, String s1)
    {
        asa asa1 = avv.m(a).a();
        if (avv.h(a) == aoa1 && asa1 != null && TextUtils.equals(asa1.a, s) && !avv.h(a).b().a(cgd1) && !a.P() && a.J())
        {
            if (eev.a("Conv", 3))
            {
                cgd1 = String.valueOf(cgd1);
                eev.d("Conv", (new StringBuilder(String.valueOf(s).length() + 60 + String.valueOf(cgd1).length() + String.valueOf(s1).length())).append("Received easter egg for conversation: ").append(s).append(" from: ").append(cgd1).append(" with message: ").append(s1).toString());
            }
            if (avv.M(a) != null)
            {
                avv.M(a).a(aoa1, s1);
            }
        }
    }

    public void a(aoa aoa1, String s, cgd cgd1, String s1, long l, boolean flag)
    {
        aoa1 = avv.m(a).a();
        break MISSING_BLOCK_LABEL_13;
        if (aoa1 != null && TextUtils.equals(((asa) (aoa1)).a, s) && !avv.h(a).b().a(cgd1) && !a.P() && a.J())
        {
            if (!avv.m(a).f().a(cgd1))
            {
                eev.a("Babel", "Got typing status before mParticipantCache initialized. Dropping on the floor.");
                return;
            }
            aoa1 = a.a(cgd1);
            if (aoa1 != null)
            {
                if (flag)
                {
                    avv.E(a).put(cgd1, new ayr(a, s1));
                    avv.D(a).a(aoa1, 4);
                } else
                {
                    avv.E(a).remove(cgd1);
                    avv.D(a).a(aoa1, 4, true);
                }
                if (eev.a("Conv", 3))
                {
                    aoa1 = String.valueOf(cgd1);
                    eev.d("Conv", (new StringBuilder(String.valueOf(aoa1).length() + 35)).append("Typing status for ").append(aoa1).append(" changed to ").append(flag).toString());
                }
                avv.G(a).removeCallbacks(avv.F(a));
                avv.G(a).post(avv.F(a));
                avv.G(a).postDelayed(avv.F(a), 31000L);
                return;
            }
        }
        return;
    }

    public void a(aoa aoa1, String s, Runnable runnable)
    {
        b(aoa1, s, runnable);
    }

    public void a(String s, cgd cgd1, boolean flag)
    {
        asa asa1;
        asa1 = avv.m(a).a();
        break MISSING_BLOCK_LABEL_14;
        if (asa1 != null && TextUtils.equals(asa1.a, s) && !avv.h(a).b().a(cgd1) && !a.P() && a.J())
        {
            if (!avv.m(a).f().a(cgd1))
            {
                avv.C(a).add(new ayo(a, s, cgd1, flag));
                return;
            }
            s = a.a(cgd1);
            if (s != null)
            {
                if (flag)
                {
                    avv.D(a).a(s, 2);
                    return;
                } else
                {
                    avv.D(a).a(s, 2, true);
                    return;
                }
            }
        }
        return;
    }

    public void a(String s, String s1)
    {
        gdv.a();
        avv.b(a).a(new ayq(this, s, s1));
    }

    public void a(String s, List list)
    {
label0:
        {
            asa asa1 = avv.m(a).a();
            if (asa1 != null && TextUtils.equals(asa1.a, s) && a.J())
            {
                if (list == null)
                {
                    s = "null";
                } else
                {
                    s = String.valueOf(list.size());
                }
                eev.c("Conv", String.format("onUserHangoutPresenceChanged: handling %s participants", new Object[] {
                    s
                }));
                int i;
                if (list != null && !list.isEmpty())
                {
                    s = new ArrayList(list.size());
                    list = list.iterator();
                    do
                    {
                        if (!list.hasNext())
                        {
                            break;
                        }
                        Object obj = (cgd)list.next();
                        cfz cfz = a.a(((cgd) (obj)));
                        if (cfz != null && !avv.h(a).b().a(((cgd) (obj))))
                        {
                            s.add(cfz);
                            obj = String.valueOf(obj);
                            eev.c("Conv", (new StringBuilder(String.valueOf(obj).length() + 36)).append("onUserHangoutPresenceChanged: added ").append(((String) (obj))).toString());
                        }
                    } while (true);
                } else
                {
                    s = null;
                }
                if (s != null && !s.isEmpty())
                {
                    break label0;
                }
                avv.L(a).a();
                avv.L(a).setVisibility(8);
                eev.c("Conv", "onUserHangoutPresenceChanged: display no participants");
            }
            return;
        }
        avv.L(a).a(avv.h(a), s);
        avv.L(a).setVisibility(0);
        i = s.size();
        eev.c("Conv", (new StringBuilder(62)).append("onUserHangoutPresenceChanged: display ").append(i).append(" participants").toString());
    }

    public void b()
    {
        avv.y(a);
    }

    public void b(String s, String s1)
    {
        asa asa1;
        for (asa1 = avv.m(a).a(); asa1 == null || asa1.a == null || !TextUtils.equals(s1, avv.N(a)) && !avv.A(a).containsKey(s) || avv.z(a) != -1;)
        {
            return;
        }

        s = new aia(asa1.a, 1);
        s.d = true;
        s.e = true;
        avv.a(a, s);
    }

    public void c()
    {
        if (a.P() || !a.J())
        {
            return;
        } else
        {
            avv.J(a);
            ((aqu)avv.K(a)).notifyDataSetChanged();
            return;
        }
    }
}
