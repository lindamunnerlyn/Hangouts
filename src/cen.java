// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cen extends cdu
{

    private static final String x;
    private static final String y;
    private static final Object z = new Object();
    private final boolean A;
    private final boolean B;
    public long a;

    cen(Context context, int i1, ccy ccy1, boolean flag, boolean flag1)
    {
        super(context, i1, ccy1);
        A = flag;
        B = flag1;
        if (b)
        {
            ebw.b("Babel", "[Notifications] Single Conversation");
        }
        ccy1 = (cda)ccy1.b.get(0);
        b(((cda) (ccy1)).a);
        c(((cda) (ccy1)).a);
        if (b)
        {
            ebw.b("Babel", "single message needs notification");
        }
        cdr cdr1 = (cdr)((cda) (ccy1)).h.get(0);
        h = cdr1.c;
        i = cdr1.d;
        if (h != null && TextUtils.isEmpty(cdr1.b))
        {
            int j1 = l.jf;
            if (i == 2)
            {
                j1 = l.jd;
            } else
            if (i == 3)
            {
                j1 = l.jn;
            } else
            if (i == 4)
            {
                j1 = l.jg;
            } else
            if (i == 6)
            {
                j1 = l.jm;
            } else
            if (i == 7)
            {
                j1 = l.jh;
            }
            f = context.getString(j1);
        } else
        {
            f = cdr1.b;
        }
        if (((cda) (ccy1)).c)
        {
            d = f;
            c = cdr1.r;
            if (ank.f(context, i1))
            {
                e = context.getString(l.N, new Object[] {
                    ((cda) (ccy1)).f
                });
            } else
            {
                f = cej.a(context, cdr1.q, cdr1.b, h, i);
                e = ((cda) (ccy1)).f;
            }
        } else
        {
            e = ((cdr)((cda) (ccy1)).h.get(0)).r;
        }
        g = g.a(i1, ((cda) (ccy1)).a, ((cda) (ccy1)).e);
        g.putExtra("reset_chat_notifications", true);
        g.putExtra("opened_from_impression", 1637);
        a = ((cda) (ccy1)).m;
    }

    private Notification a(int i1, boolean flag)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj = null;
        obj1 = q.a();
        Uri uri = EsProvider.a(EsProvider.j, p).buildUpon().appendQueryParameter("limit", "21").build();
        arraylist = new ArrayList();
        obj1 = o.getContentResolver().query(uri, cdt.a, x, new String[] {
            obj1
        }, "timestamp DESC");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        boolean flag1 = ((Cursor) (obj1)).moveToFirst();
        if (!flag1)
        {
            ((Cursor) (obj1)).close();
            return null;
        }
        boolean flag2;
        do
        {
            cdr cdr1 = new cdr(((Cursor) (obj1)), p);
            if (cdr1.q != null && (!TextUtils.isEmpty(cdr1.b) || cdr1.c != null))
            {
                arraylist.add(cej.a(o, cdr1.q, cdr1.b, cdr1.c, cdr1.d));
            }
            flag2 = ((Cursor) (obj1)).moveToNext();
        } while (flag2);
        ((Cursor) (obj1)).close();
        if (arraylist.size() <= 1)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_228;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        int j1;
        obj1 = new SpannableStringBuilder();
        int k1 = arraylist.size() - 1;
        j1 = k1;
        if (arraylist.size() == 21)
        {
            ((SpannableStringBuilder) (obj1)).append(o.getString(l.bJ)).append("\n\n");
            j1 = k1 - 1;
        }
        for (; j1 >= 0; j1--)
        {
            ((SpannableStringBuilder) (obj1)).append((CharSequence)arraylist.get(j1));
            if (j1 > 0)
            {
                ((SpannableStringBuilder) (obj1)).append("\n\n");
            }
        }

        j1 = i1 + 1;
        if (j1 <= 2) goto _L2; else goto _L1
_L1:
        obj = o.getResources();
        if (flag)
        {
            i1 = g.hR;
        } else
        {
            i1 = g.hQ;
        }
        obj = new SpannableString(((Resources) (obj)).getQuantityString(i1, j1, new Object[] {
            Integer.valueOf(j1)
        }));
_L4:
        if (obj != null)
        {
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(o.getResources().getColor(g.dV)), 0, ((SpannableString) (obj)).length(), 33);
            ((SpannableStringBuilder) (obj1)).append("\n\n").append(((CharSequence) (obj)));
        }
        obj = new cf(o);
        ((cf) (obj)).a((new ce(((cf) (obj)))).b(((CharSequence) (obj1))));
        obj1 = new cs();
        ((cs) (obj1)).a();
        ((cf) (obj)).a(((ch) (obj1)));
        return ((cf) (obj)).g();
_L2:
        if (flag)
        {
            obj = new SpannableString(o.getResources().getString(l.kN));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1, int j1, int k1)
    {
        cda cda1 = (cda)k.b.get(0);
        if (A)
        {
            cdr cdr1 = (cdr)cda1.h.get(0);
            k1 = p;
            long l1 = SystemClock.elapsedRealtime();
            byy byy1 = new byy();
            if (!B)
            {
                j1 = i1;
            }
            h.a(k1, l1, 10, byy1.a(j1).c(cdr1.k).a(cda1.a).a(true));
            return;
        } else
        {
            cdr.a(p, k.b, 0, 0, k1, false, false, null);
            return;
        }
    }

    static void a(Context context, int i1, dzx dzx1)
    {
        dzx dzx2;
        dzx2 = dzx1;
        if (dzx1 != null)
        {
            dzx2 = dzx1;
            if (dzx1.size() > 1)
            {
                dzx2 = dzx1;
                if (!ccx.c(context))
                {
                    dzx2 = null;
                }
            }
        }
        dzx1 = ((dzx) (z));
        dzx1;
        JVM INSTR monitorenter ;
        dzx dzx3 = b(context, i1);
        if (dzx3 == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        Iterator iterator = dzx3.iterator();
_L3:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_173;
        }
        s = (String)iterator.next();
        if (dzx2 == null) goto _L2; else goto _L1
_L1:
        if (dzx2.contains(s)) goto _L3; else goto _L2
_L2:
        s = a(context, i1, s);
        db db1 = db.a(context);
        ced.a(s, 0);
        db1.a(s, 0);
        if (b)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 57)).append("SingleConversationNotifier.cancel [tag=]").append(s).append(" [id=]0").toString());
        }
          goto _L3
        context;
        dzx1;
        JVM INSTR monitorexit ;
        throw context;
        context = ((gms)hgx.a(context, gms)).b(i1);
        if (dzx2 != null) goto _L5; else goto _L4
_L4:
        if (dzx3 == null) goto _L7; else goto _L6
_L6:
        context.c("notifications_group_children_key", null).d();
        if (!b) goto _L7; else goto _L8
_L8:
        context = "Writing to prefstore: no notified conversations";
_L11:
        ebw.b("Babel", context);
_L7:
        dzx1;
        JVM INSTR monitorexit ;
        return;
_L5:
        if (dzx2.equals(dzx3)) goto _L7; else goto _L9
_L9:
        context.c("notifications_group_children_key", dzx2.b()).d();
        if (!b) goto _L7; else goto _L10
_L10:
        context = String.valueOf(dzx2.b());
        if (context.length() == 0)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        context = "Writing to prefstore: notified conversations ".concat(context);
          goto _L11
        context = new String("Writing to prefstore: notified conversations ");
          goto _L11
        context;
          goto _L7
    }

    private PendingIntent b(boolean flag)
    {
        boolean flag2 = true;
        Object obj;
        String s;
        int i1;
        long l1;
        boolean flag1;
        if (((cda)k.b.get(0)).c && q() && drk.c())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = o;
        i1 = p;
        s = q.a();
        l1 = a;
        if (w())
        {
            flag2 = false;
        }
        obj = BabelGatewayActivity.a(((Context) (obj)), i1, s, l1, flag1, flag2);
        ((Intent) (obj)).setFlags(0x10008000);
        if (flag)
        {
            ((Intent) (obj)).putExtra("opened_from_impression", 2257);
            i1 = u();
        } else
        {
            i1 = super.t();
        }
        return PendingIntent.getActivity(o, i1, ((Intent) (obj)), 0x8000000);
    }

    private static dzx b(Context context, int i1)
    {
        try
        {
            context = ((gms)hgx.a(context, gms)).a(i1).a("notifications_group_children_key", "");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = "";
        }
        if (context != null && context.length() > 0)
        {
            if (b)
            {
                String s = String.valueOf(context);
                if (s.length() != 0)
                {
                    s = "Reading from prefstore: notified conversations ".concat(s);
                } else
                {
                    s = new String("Reading from prefstore: notified conversations ");
                }
                ebw.b("Babel", s);
            }
            return dzx.a(context);
        }
        if (b)
        {
            ebw.b("Babel", "Reading from prefstore: no notified conversations");
        }
        return null;
    }

    private h v()
    {
        Object obj;
        Object obj1;
        obj1 = q.a();
        Uri uri = EsProvider.a(EsProvider.j, p);
        obj = null;
        obj1 = o.getContentResolver().query(uri, cdt.a, y, new String[] {
            obj1
        }, "timestamp ASC");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L3
_L3:
        cdr cdr1 = new cdr(((Cursor) (obj1)), p);
        if (TextUtils.isEmpty(cdr1.b)) goto _L6; else goto _L5
_L5:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj = new h(cdr1.r);
        ((h) (obj)).a(cdr1.o.g / 1000L);
        ((h) (obj)).a(cdr1.b.toString());
_L6:
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L3; else goto _L7
_L7:
        ((Cursor) (obj1)).close();
        return ((h) (obj));
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
_L4:
        obj = null;
        if (true) goto _L7; else goto _L2
_L2:
        return null;
    }

    private boolean w()
    {
        return ((cda)k.b.get(0)).b();
    }

    protected void a(boolean flag)
    {
        Resources resources = o.getResources();
        cda cda1 = (cda)k.b.get(0);
        Object obj1 = cda1.h;
        int i1 = ((List) (obj1)).size();
        t.a(e).c(m()).b(f);
        if (k.a > 1)
        {
            t.b(k.a);
        }
        if (i1 == 1 && h != null && i != 2)
        {
            if (b)
            {
                ebw.b("Babel", "SINGLE ATTACHMENT MESSAGE");
            }
            String s;
            boolean flag1;
            if (h.startsWith("//"))
            {
                s = String.valueOf(h);
                if (s.length() != 0)
                {
                    s = "http:".concat(s);
                } else
                {
                    s = new String("http:");
                }
                h = s;
            }
            s = ((cdr)((List) (obj1)).get(0)).q;
            this.s = (new cd(t)).a(a(o, s, null, null, 0));
            if (i == 3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj1 = new apw((new eam(h, ((gms)hgx.a(o, gms)).a(p).b("account_name"))).a(resources.getDimensionPixelSize(g.eG), resources.getDimensionPixelSize(g.eF)).c(flag1).d(true), new ceo(this), false, this);
            if (b)
            {
                s = String.valueOf(h);
                if (s.length() != 0)
                {
                    s = "postNotification created ImageRequest on: ".concat(s);
                } else
                {
                    s = new String("postNotification created ImageRequest on: ");
                }
                ebw.b("Babel", s);
            }
            ((dmt)hgx.a(o, dmt)).c(((dlt) (obj1)));
        } else
        {
            ce ce1 = new ce(t);
            this.s = ce1;
            if (i1 == 1)
            {
                if (b)
                {
                    ebw.b("Babel", "SINGLE TEXT MESSAGE");
                }
                ce1.b(f);
            } else
            {
                if (b)
                {
                    ebw.b("Babel", "MULTIPLE MESSAGE for the same conversation");
                }
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
                int j1 = ((List) (obj1)).size() - 1;
                while (j1 >= 0) 
                {
                    Object obj = (cdr)(ceb)((List) (obj1)).get(j1);
                    h = ((cdr) (obj)).c;
                    i = ((cdr) (obj)).d;
                    CharSequence charsequence = ((cdr) (obj)).b;
                    if (TextUtils.isEmpty(charsequence) && TextUtils.isEmpty(h))
                    {
                        continue;
                    }
                    if (cda1.c && !ank.f(o, p))
                    {
                        obj = cej.a(o, ((cdr) (obj)).q, charsequence, h, i);
                    } else
                    {
                        obj = cej.a(o, null, charsequence, h, i);
                    }
                    spannablestringbuilder.append(((CharSequence) (obj)));
                    if (j1 > 0)
                    {
                        spannablestringbuilder.append('\n');
                    }
                    j1--;
                }
                ce1.b(spannablestringbuilder);
            }
        }
        t.a(cda1.g / 1000L);
        super.a(flag);
    }

    protected void h()
    {
        if (ccx.b(o) && !q() && !((cda)k.b.get(0)).c)
        {
            Object obj = v();
            if (obj != null)
            {
                PendingIntent pendingintent = b(false);
                dl dl = a(o);
                Intent intent = BabelGatewayActivity.a(p, q.a());
                int i1 = super.t();
                obj = ((h) (obj)).a(PendingIntent.getActivity(o, i1 + 1, intent, 0x8000000)).a(pendingintent, dl).a();
                t.a((new e()).a(((g) (obj))).a(o.getResources().getColor(g.dc)));
            }
        }
        if (!ccx.a(o)) goto _L2; else goto _L1
_L1:
        int k1 = o.getSharedPreferences("wearablePrefs", 0).getInt("api_level", 22);
        u.a();
        boolean flag = q();
        Object obj1;
        Object obj3;
        Bundle bundle;
        int j1;
        if (((cda)k.b.get(0)).c && flag && drk.c())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            j1 = l.hh;
        } else
        if (flag)
        {
            j1 = l.hi;
        } else
        {
            j1 = l.hg;
        }
        obj1 = a(o);
        obj3 = b(true);
        obj3 = new cc(com.google.android.apps.hangouts.R.drawable.bo, o.getString(j1), ((PendingIntent) (obj3)));
        ((cc) (obj3)).a(((dl) (obj1)));
        u.a(((cc) (obj3)).b());
        if (k1 <= 21) goto _L4; else goto _L3
_L3:
        obj1 = new cc(com.google.android.apps.hangouts.R.drawable.bv, o.getString(l.hq), s());
        obj3 = new Bundle();
        ((Bundle) (obj3)).putInt("type", 2);
        ((Bundle) (obj3)).putString("action", "android.intent.action.VIEW");
        ((Bundle) (obj3)).putString("packageName", "com.google.android.talk");
        ((Bundle) (obj3)).putInt("flags", 32768);
        bundle = new Bundle();
        bundle.putString("accountGaia", ank.d(o, p));
        bundle.putString("conversationId", q.a());
        ((Bundle) (obj3)).putBundle("extras", bundle);
        ((cc) (obj1)).a().putBundle("com.google.android.wearable.preview.extra.REMOTE_INTENT", ((Bundle) (obj3)));
        u.a(((cc) (obj1)).b());
_L2:
        super.h();
        return;
_L4:
        Object obj2 = q.a();
        obj2 = a(amz.b(dbf.e(p), ((String) (obj2))), w());
        if (obj2 != null)
        {
            u.a(((Notification) (obj2)));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void i()
    {
        super.i();
        cda cda1 = (cda)k.b.get(0);
        ani ani = dbf.e(p);
        char c;
        if (cda1.h.size() == 1)
        {
            c = '\u0786';
        } else
        {
            c = '\u0787';
        }
        g.a(ani, c);
        a(405, 457, 463);
    }

    protected String j()
    {
        return a(o, p, q.a());
    }

    protected void k()
    {
        a(406, 458, 464);
    }

    protected int p()
    {
        return super.p() + 2;
    }

    static 
    {
        String s = String.valueOf("conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?)) AND type IN (");
        int i1 = dqc.c.ordinal();
        int j1 = dqc.b.ordinal();
        x = (new StringBuilder(String.valueOf(s).length() + 25)).append(s).append(i1).append(", ").append(j1).append(")").toString();
        s = String.valueOf("conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?)) AND type IN (");
        i1 = dqc.c.ordinal();
        j1 = dqc.b.ordinal();
        String s1 = String.valueOf("timestamp");
        String s2 = String.valueOf("chat_watermark");
        String s3 = String.valueOf("timestamp");
        String s4 = String.valueOf("1355097600000000");
        y = (new StringBuilder(String.valueOf(s).length() + 39 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(i1).append(", ").append(j1).append(") AND ").append(s1).append(">").append(s2).append(" AND ").append(s3).append(" > ").append(s4).toString();
    }
}
