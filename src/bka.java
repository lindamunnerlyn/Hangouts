// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bka extends bmk
    implements dgn, frn
{

    private static volatile boolean r = false;
    public List j;
    final ArrayList k = new ArrayList();
    private boolean m;
    private boolean n;
    private ani o;

    public bka()
    {
    }

    static hgx a(bka bka1)
    {
        return bka1.p;
    }

    public static void b(boolean flag)
    {
        r = flag;
    }

    public boolean a(MenuItem menuitem)
    {
        return false;
    }

    public boolean a(ani ani1, dzf dzf1)
    {
        dzf1 = dzf1.a;
        if (dzf1 != null && !ank.g(this, ani1.h()))
        {
            dzf1.setFlags(dzf1.getFlags() & 0xefffffff);
            o = ani1;
            startActivityForResult(dzf1, 100);
            return true;
        } else
        {
            return false;
        }
    }

    public void b(int i)
    {
        if (k())
        {
            return;
        } else
        {
            ejn.a(i, this, 103, new bkb(this));
            return;
        }
    }

    public void b(Runnable runnable)
    {
        k.add(runnable);
    }

    public View c(int i)
    {
        FrameLayout framelayout = new FrameLayout(this);
        framelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        getLayoutInflater().inflate(i, framelayout, true);
        return framelayout;
    }

    public boolean k()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return super.isDestroyed();
        } else
        {
            return n;
        }
    }

    public void onActivityResult(int i, int l, Intent intent)
    {
        String s = String.valueOf(Integer.toHexString(i));
        if (s.length() != 0)
        {
            "EsFragmentActivity.onActivityResult ".concat(s);
        } else
        {
            new String("EsFragmentActivity.onActivityResult ");
        }
        super.onActivityResult(i, l, intent);
        i;
        JVM INSTR tableswitch 100 103: default 64
    //                   100 78
    //                   101 160
    //                   102 186
    //                   103 198;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_198;
_L6:
        return;
_L2:
        if (o != null)
        {
            if (l != -1)
            {
                ((gms)p.a(gms)).b(o.h()).c("logged_in", false).d();
            } else
            {
                (new bkc(this, o.a())).execute(new Void[0]);
            }
            o = null;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (l == -1 && intent != null && intent.getExtras().containsKey("new_conversation_created"))
        {
            finish();
            return;
        }
        if (true) goto _L6; else goto _L4
_L4:
        ebw.a("Babel", "Triggering contacts cache refresh");
        dme.a(true);
        return;
        m = true;
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!g.nT)
        {
            frl.a(this, this);
        }
        j = p.c(cpl);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((cpl)iterator.next()).a(getMenuInflater(), menu)) { }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        n = true;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 82 && android.os.Build.VERSION.SDK_INT <= 16 && "LGE".equalsIgnoreCase(Build.MANUFACTURER))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 82 && android.os.Build.VERSION.SDK_INT <= 16 && "LGE".equalsIgnoreCase(Build.MANUFACTURER))
        {
            openOptionsMenu();
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag;
label0:
        {
            boolean flag1 = a(menuitem);
            flag = flag1;
            if (flag1)
            {
                break label0;
            }
            Iterator iterator = j.iterator();
            flag = flag1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                flag1 = ((cpl)iterator.next()).a(this, menuitem);
                flag = flag1;
            } while (!flag1);
            flag = flag1;
        }
        return flag || super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        gmo gmo1 = (gmo)p.b(gmo);
        if (gmo1 != null && gmo1.b())
        {
            dii.a(dbf.e(gmo1.a()), false);
        }
        if (dzy.b())
        {
            getClass().getSimpleName();
            dzy.a();
        }
        RealTimeChatService.a(null);
        dkz.c().a(true);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((cpl)iterator.next()).a(menu)) { }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        if (r)
        {
            r = false;
            Intent intent = g.e(null);
            intent.addFlags(0x4008000);
            startActivity(intent);
            finish();
        } else
        if (g.a(true, false))
        {
            if (m)
            {
                frl.a(this, this);
            }
            m = false;
            gmo gmo1 = (gmo)p.b(gmo);
            if (gmo1 != null && gmo1.b())
            {
                dii.a(dbf.e(gmo1.a()), true);
            }
            if (dzy.b())
            {
                dzy.a(getClass().getSimpleName());
            }
            RealTimeChatService.a(this);
            dbf.b(false);
            dkz.c().a(false);
            RealTimeChatService.g();
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        if (r)
        {
            r = false;
            Intent intent = g.e(null);
            intent.addFlags(0x4008000);
            startActivity(intent);
            finish();
        }
    }

    public void onStop()
    {
        super.onStop();
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        k.clear();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag)
        {
            Object obj = (gmo)p.b(gmo);
            if (obj != null && ((gmo) (obj)).b())
            {
                obj = dbf.e(((gmo) (obj)).a());
                if (obj != null && !((ani) (obj)).q())
                {
                    RealTimeChatService.e(((ani) (obj)));
                }
            }
        }
    }

}
