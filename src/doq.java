// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.widget.ArrayAdapter;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class doq
{

    private final Context a;
    private final gms b;

    doq(Context context)
    {
        a = context;
        b = (gms)hgx.a(context, gms);
    }

    static void a(int i, int j)
    {
        b(i, j);
    }

    private static List b()
    {
        ArrayList arraylist = new ArrayList(7);
        for (int i = 0; i < 7; i++)
        {
            int j = (new int[] {
                0, 1, 2, 4, 8, 24, 72
            })[i];
            arraylist.add(Integer.valueOf((int)TimeUnit.HOURS.toMillis(j)));
        }

        if (ebr.a())
        {
            arraylist.add(1, Integer.valueOf((int)TimeUnit.MINUTES.toMillis(1L)));
            arraylist.add(2, Integer.valueOf((int)TimeUnit.MINUTES.toMillis(5L)));
            arraylist.add(3, Integer.valueOf((int)TimeUnit.MINUTES.toMillis(10L)));
        }
        return arraylist;
    }

    private static void b(int i, int j)
    {
        long l1 = g.a((Integer)b().get(j), 0);
        if (l1 == 0L)
        {
            RealTimeChatService.a(i, -1L);
            return;
        } else
        {
            long l2 = System.currentTimeMillis();
            RealTimeChatService.a(i, TimeUnit.MILLISECONDS.toMicros(l1 + l2));
            return;
        }
    }

    public String a(String s, int i)
    {
        if ("sms_notification_sound_key".equals(s))
        {
            i = b.b("SMS");
        }
        String s1 = b.a(i).b(s);
        if (s1 != null)
        {
            return s1;
        }
        if ("hangout_sound_key".equals(s))
        {
            return ebr.b(g.ig);
        } else
        {
            return ebr.b(g.ih);
        }
    }

    public List a()
    {
        Resources resources = a.getResources();
        Object obj = b();
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            int i = g.a((Integer)((Iterator) (obj)).next(), 0);
            if (i == 0)
            {
                arraylist.add(resources.getString(l.bD));
            } else
            if ((long)i < TimeUnit.HOURS.toMillis(1L))
            {
                i = (int)TimeUnit.MILLISECONDS.toMinutes(i);
                arraylist.add(resources.getQuantityString(g.hE, i, new Object[] {
                    Integer.valueOf(i)
                }));
            } else
            {
                i = (int)TimeUnit.MILLISECONDS.toHours(i);
                arraylist.add(resources.getQuantityString(g.hD, i, new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        return arraylist;
    }

    public void a(int i, long l1)
    {
        b.b(i).c("dnd_expiration", l1).d();
    }

    public void a(int i, String s)
    {
        int j = a().indexOf(s);
        if (j == -1)
        {
            ebw.g("Babel", "Unrecognized DND choice");
            return;
        } else
        {
            b(i, j);
            return;
        }
    }

    public void a(Activity activity, int i, Runnable runnable)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        activity = new ArrayAdapter(activity, g.fO);
        for (Iterator iterator = a().iterator(); iterator.hasNext(); activity.add((String)iterator.next())) { }
        builder.setTitle(l.bA);
        dor dor1 = new dor(this, i, runnable);
        builder.setOnCancelListener(new dos(this, runnable));
        builder.setAdapter(activity, dor1);
        builder.show();
    }

    public boolean a(int i)
    {
        return b.a(i).a("chat_notification_enabled_key", true);
    }

    public boolean b(int i)
    {
        return b.a(i).a("hangouts_notification_enabled_key", true);
    }

    public boolean c(int i)
    {
        return b.a(i).a("hangout_vibrate_boolean_key", true);
    }

    public long d(int i)
    {
        if (i == -1)
        {
            return 0L;
        } else
        {
            return b.a(i).a("dnd_expiration", 0L);
        }
    }
}
