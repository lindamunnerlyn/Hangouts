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

public class bkm extends bmr
    implements dhw, ftu
{

    public static volatile boolean k = false;
    public List j;
    final ArrayList l = new ArrayList();
    private boolean n;
    private boolean o;
    private aoa p;

    public bkm()
    {
    }

    public boolean a(MenuItem menuitem)
    {
        return false;
    }

    public boolean a(aoa aoa1, ecm ecm1)
    {
        ecm1 = ecm1.a;
        if (ecm1 != null && !aoc.g(this, aoa1.h()))
        {
            ecm1.setFlags(ecm1.getFlags() & 0xefffffff);
            p = aoa1;
            startActivityForResult(ecm1, 100);
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
            emo.a(i, this, 103, new bkn(this));
            return;
        }
    }

    public void b(Runnable runnable)
    {
        l.add(runnable);
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
            return o;
        }
    }

    public void onActivityResult(int i, int i1, Intent intent)
    {
        String s = String.valueOf(Integer.toHexString(i));
        if (s.length() != 0)
        {
            "EsFragmentActivity.onActivityResult ".concat(s);
        } else
        {
            new String("EsFragmentActivity.onActivityResult ");
        }
        super.onActivityResult(i, i1, intent);
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
        if (p != null)
        {
            if (i1 != -1)
            {
                ((gqz)q.a(gqz)).b(p.h()).c("logged_in", false).d();
            } else
            {
                (new bko(this, p.a())).execute(new Void[0]);
            }
            p = null;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 == -1 && intent != null && intent.getExtras().containsKey("new_conversation_created"))
        {
            finish();
            return;
        }
        if (true) goto _L6; else goto _L4
_L4:
        eev.a("Babel", "Triggering contacts cache refresh");
        doy.a(true);
        return;
        n = true;
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!g.nV)
        {
            fts.a(this, this);
        }
        j = q.c(crc);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((crc)iterator.next()).a(getMenuInflater(), menu)) { }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        o = true;
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
                flag1 = ((crc)iterator.next()).a(this, menuitem);
                flag = flag1;
            } while (!flag1);
            flag = flag1;
        }
        return flag || super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        gqu gqu1 = (gqu)q.b(gqu);
        if (gqu1 != null && gqu1.b())
        {
            djt.a(dcn.e(gqu1.a()), false);
        }
        if (edc.b())
        {
            getClass().getSimpleName();
            edc.a();
        }
        RealTimeChatService.a(null);
        dnw.c().a(true);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((crc)iterator.next()).a(menu)) { }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        if (k)
        {
            k = false;
            Intent intent = g.d(null);
            intent.addFlags(0x4008000);
            startActivity(intent);
            finish();
        } else
        if (g.a(true, false))
        {
            if (n)
            {
                fts.a(this, this);
            }
            n = false;
            gqu gqu1 = (gqu)q.b(gqu);
            if (gqu1 != null && gqu1.b())
            {
                djt.a(dcn.e(gqu1.a()), true);
            }
            if (edc.b())
            {
                edc.a(getClass().getSimpleName());
            }
            RealTimeChatService.a(this);
            dcn.b(false);
            dnw.c().a(false);
            RealTimeChatService.g();
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        if (k)
        {
            k = false;
            Intent intent = g.d(null);
            intent.addFlags(0x4008000);
            startActivity(intent);
            finish();
        }
    }

    public void onStop()
    {
        super.onStop();
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        l.clear();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag)
        {
            Object obj = (gqu)q.b(gqu);
            if (obj != null && ((gqu) (obj)).b())
            {
                obj = dcn.e(((gqu) (obj)).a());
                if (obj != null && !((aoa) (obj)).o())
                {
                    RealTimeChatService.e(((aoa) (obj)));
                }
            }
        }
    }

}
