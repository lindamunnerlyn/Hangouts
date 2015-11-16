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

final class ayb extends dgp
{

    final ave a;

    ayb(ave ave1)
    {
        a = ave1;
        super();
    }

    private void a(dcg dcg1)
    {
        if (dcg1 == null)
        {
            dcg1 = String.valueOf(ave.o(a).a().h);
            ebw.g("Conv", (new StringBuilder(String.valueOf(dcg1).length() + 64)).append("creating conversation with ").append(dcg1).append(" resulting in null ConversationResult").toString());
            return;
        }
        String s = String.valueOf(dcg1.a);
        if (s.length() != 0)
        {
            s = "Switching conversation; clearing text. New id:".concat(s);
        } else
        {
            s = new String("Switching conversation; clearing text. New id:");
        }
        ebw.f("Conv", s);
        dcg1 = new aih(dcg1.a, 0);
        dcg1.d = true;
        dcg1.e = true;
        dcg1.f = a.S();
        a.J();
        ave.a(a, dcg1);
    }

    private void b(ani ani1, String s, Runnable runnable)
    {
        while (!ani1.equals(ave.h(a)) || !ave.B(a).containsKey(s)) 
        {
            return;
        }
        if (ave.B(a).size() > 1)
        {
            for (ani1 = ave.B(a).keySet().iterator(); ani1.hasNext();)
            {
                runnable = (String)ani1.next();
                if (!TextUtils.equals(runnable, s))
                {
                    ani1 = new aih(runnable, 1);
                    ave.a(a, ani1);
                    return;
                }
            }

            gbh.a("should never get here");
            return;
        } else
        {
            ave.C(a).a(runnable);
            return;
        }
    }

    public void a(int i, ani ani1, dcg dcg1, dgu dgu1)
    {
        if (i != ave.A(a))
        {
            return;
        } else
        {
            a(dcg1);
            return;
        }
    }

    public void a(int i, ani ani1, dcg dcg1, dgu dgu1, int j)
    {
        if (ebw.a("Conv", 3))
        {
            dgu1 = String.valueOf(dcg1.a);
            String s = String.valueOf(ani1);
            ebw.c("Conv", (new StringBuilder(String.valueOf(dgu1).length() + 81 + String.valueOf(s).length())).append("Forked a new conversation ").append(dgu1).append(" from an existing conversation ").append(j).append(" for account ").append(s).toString());
        }
        if (!ani1.equals(ave.h(a)))
        {
            return;
        } else
        {
            a(dcg1);
            return;
        }
    }

    public void a(int i, ani ani1, dgu dgu1)
    {
        ani1 = dgu1.c();
        if (ani1 instanceof cwh)
        {
            ani1 = (cuc)ani1.c();
            if (((cuc) (ani1)).b && !((cuc) (ani1)).a)
            {
                ani1 = (axo)ave.B(a).get(((cuc) (ani1)).c);
                if (ani1 != null)
                {
                    ani1.e = -1;
                }
            }
        }
    }

    public void a(int i, ani ani1, dko dko, dbo dbo)
    {
        if (dko instanceof cuc)
        {
            ani1 = (cuc)dko;
            if (((cuc) (ani1)).b && !((cuc) (ani1)).a)
            {
                ani1 = (axo)ave.B(a).get(((cuc) (ani1)).c);
                if (ani1 != null)
                {
                    a.K();
                    ani1.e = -1;
                    ebw.e("Conv", "message load timeout");
                }
            }
        } else
        if ((dko instanceof ctv) && ((ctv)dko).j.equals(a.O()))
        {
            a.G();
            a.getActivity().p_();
            return;
        }
    }

    public void a(ani ani1, String s)
    {
        b(ani1, s, null);
    }

    public void a(ani ani1, String s, cey cey1, String s1)
    {
        ark ark1 = ave.o(a).a();
        if (ave.h(a) == ani1 && ark1 != null && TextUtils.equals(ark1.a, s) && !ave.h(a).b().a(cey1) && !a.P() && a.I())
        {
            if (ebw.a("Conv", 3))
            {
                cey1 = String.valueOf(cey1);
                ebw.d("Conv", (new StringBuilder(String.valueOf(s).length() + 60 + String.valueOf(cey1).length() + String.valueOf(s1).length())).append("Received easter egg for conversation: ").append(s).append(" from: ").append(cey1).append(" with message: ").append(s1).toString());
            }
            if (ave.M(a) != null)
            {
                ave.M(a).a(ani1, s1);
            }
        }
    }

    public void a(ani ani1, String s, cey cey1, String s1, long l, boolean flag)
    {
        ani1 = ave.o(a).a();
        break MISSING_BLOCK_LABEL_13;
        if (ani1 != null && TextUtils.equals(((ark) (ani1)).a, s) && !ave.h(a).b().a(cey1) && !a.P() && a.I())
        {
            if (!ave.o(a).f().a(cey1))
            {
                ebw.a("Babel", "Got typing status before mParticipantCache initialized. Dropping on the floor.");
                return;
            }
            ani1 = a.a(cey1);
            if (ani1 != null)
            {
                if (flag)
                {
                    ave.F(a).put(cey1, new ayd(a, s1));
                    ave.E(a).a(ani1, 4);
                } else
                {
                    ave.F(a).remove(cey1);
                    ave.E(a).a(ani1, 4, true);
                }
                if (ebw.a("Conv", 3))
                {
                    ani1 = String.valueOf(cey1);
                    ebw.d("Conv", (new StringBuilder(String.valueOf(ani1).length() + 35)).append("Typing status for ").append(ani1).append(" changed to ").append(flag).toString());
                }
                ave.H(a).removeCallbacks(ave.G(a));
                ave.H(a).post(ave.G(a));
                ave.H(a).postDelayed(ave.G(a), 31000L);
                return;
            }
        }
        return;
    }

    public void a(ani ani1, String s, Runnable runnable)
    {
        b(ani1, s, runnable);
    }

    public void a(String s, cey cey1, boolean flag)
    {
        ark ark1;
        ark1 = ave.o(a).a();
        break MISSING_BLOCK_LABEL_14;
        if (ark1 != null && TextUtils.equals(ark1.a, s) && !ave.h(a).b().a(cey1) && !a.P() && a.I())
        {
            if (!ave.o(a).f().a(cey1))
            {
                ave.D(a).add(new aya(a, s, cey1, flag));
                return;
            }
            s = a.a(cey1);
            if (s != null)
            {
                if (flag)
                {
                    ave.E(a).a(s, 2);
                    return;
                } else
                {
                    ave.E(a).a(s, 2, true);
                    return;
                }
            }
        }
        return;
    }

    public void a(String s, String s1)
    {
        gbh.a();
        ave.b(a).a(new ayc(this, s, s1));
    }

    public void a(String s, List list)
    {
label0:
        {
            ark ark1 = ave.o(a).a();
            if (ark1 != null && TextUtils.equals(ark1.a, s) && a.I())
            {
                if (list == null)
                {
                    s = "null";
                } else
                {
                    s = String.valueOf(list.size());
                }
                ebw.c("Conv", String.format("onUserHangoutPresenceChanged: handling %s participants", new Object[] {
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
                        Object obj = (cey)list.next();
                        ceu ceu = a.a(((cey) (obj)));
                        if (ceu != null && !ave.h(a).b().a(((cey) (obj))))
                        {
                            s.add(ceu);
                            obj = String.valueOf(obj);
                            ebw.c("Conv", (new StringBuilder(String.valueOf(obj).length() + 36)).append("onUserHangoutPresenceChanged: added ").append(((String) (obj))).toString());
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
                ave.L(a).a();
                ave.L(a).setVisibility(8);
                ebw.c("Conv", "onUserHangoutPresenceChanged: display no participants");
            }
            return;
        }
        ave.L(a).a(ave.h(a), s);
        ave.L(a).setVisibility(0);
        i = s.size();
        ebw.c("Conv", (new StringBuilder(62)).append("onUserHangoutPresenceChanged: display ").append(i).append(" participants").toString());
    }

    public void b()
    {
        ave.z(a);
    }

    public void b(String s, String s1)
    {
        ark ark1;
        for (ark1 = ave.o(a).a(); ark1 == null || ark1.a == null || !TextUtils.equals(s1, ave.N(a)) && !ave.B(a).containsKey(s) || ave.A(a) != -1;)
        {
            return;
        }

        s = new aih(ark1.a, 1);
        s.d = true;
        s.e = true;
        ave.a(a, s);
    }

    public void c()
    {
        if (a.P() || !a.I())
        {
            return;
        } else
        {
            ave.J(a);
            ((aqd)ave.K(a)).notifyDataSetChanged();
            return;
        }
    }

    public void h_()
    {
        ave.z(a);
    }
}
