// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

final class azy
    implements bkx, hon, hov, hoy
{

    private Context a;
    private aoa b;
    private int c;
    private int d;
    private long e;
    private long f;
    private azz g;
    private final gvc h;

    azy(Context context, aoa aoa1, hof hof1)
    {
        c = 1;
        d = 2;
        e = -1L;
        f = -1L;
        a = context;
        b = aoa1;
        hof1.a(this);
        g = (azz)hlp.a(context, azz);
        h = (gvc)hlp.a(context, gvc);
    }

    private void a(Context context, int i, String s)
    {
        if (d == 2)
        {
            eev.a("OffTheRecordHandler", "toggleHistoryNotAllowed");
            if (b.m())
            {
                i = l.iH;
            } else
            {
                i = l.iG;
            }
            Toast.makeText(context, i, 0).show();
            return;
        }
        if (dcz.a(context, b.h()))
        {
            h.a(new bee(context, b, s, i));
            return;
        } else
        {
            RealTimeChatService.b(b, s, i);
            return;
        }
    }

    void a(long l1)
    {
        if (e == -1L)
        {
            e = l1;
        }
    }

    void a(Cursor cursor)
    {
        c = cursor.getInt(7);
        d = cursor.getInt(8);
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = bundle.getLong("key_last_compose_time_ms", -1L);
            f = bundle.getLong("key_otr_on_timestamp_ms", -1L);
        }
    }

    void a(Menu menu, boolean flag, boolean flag1)
    {
        MenuItem menuitem;
        boolean flag2;
        boolean flag5;
        flag5 = true;
        menuitem = menu.findItem(h.eQ);
        menu = menu.findItem(h.eR);
        Object obj = a;
        int i = b.h();
        obj = hlp.c(((Context) (obj)), aqe).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_180;
            }
        } while (!((aqe)((Iterator) (obj)).next()).a(i));
        flag2 = false;
_L1:
        if (flag2)
        {
            boolean flag3;
            boolean flag4;
            if (c == 2 && !flag)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (c == 1 && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag3 && !flag1)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            menuitem.setVisible(flag4);
            menuitem.setEnabled(flag3);
            if (flag && !flag1)
            {
                flag1 = flag5;
            } else
            {
                flag1 = false;
            }
            menu.setVisible(flag1);
            menu.setEnabled(flag);
            return;
        } else
        {
            menuitem.setVisible(false);
            menu.setVisible(false);
            return;
        }
        flag2 = true;
          goto _L1
    }

    public boolean a()
    {
        return c == 2;
    }

    boolean a(Context context, MenuItem menuitem, String s)
    {
        if (menuitem.getItemId() == h.eQ)
        {
            a(context, 1, s);
            return true;
        }
        if (menuitem.getItemId() == h.eR)
        {
            a(context, 2, s);
            return true;
        } else
        {
            return false;
        }
    }

    boolean a(ap ap)
    {
        if (e != -1L && f != -1L && f > e)
        {
            azx.a(a, ap);
            f = -1L;
            e = -1L;
            return false;
        } else
        {
            e = -1L;
            f = -1L;
            return true;
        }
    }

    void b(long l1)
    {
        if (l1 > f)
        {
            f = l1;
        }
    }

    public void b(Bundle bundle)
    {
        bundle.putLong("key_last_compose_time_ms", e);
        bundle.putLong("key_otr_on_timestamp_ms", f);
    }

    public boolean b()
    {
        return b.n();
    }

    public boolean c()
    {
        return g.t();
    }

    int d()
    {
        return c;
    }
}
