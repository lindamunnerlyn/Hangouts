// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class hpb extends pu
    implements hoe
{

    private int j;
    public final hpf r = new hpf();

    public hpb()
    {
    }

    private void c(Intent intent)
    {
        int i = j;
        j = i + 1;
        if (i == 0)
        {
            r.a(intent);
        }
    }

    private void j()
    {
        j = j - 1;
    }

    public void a(ad ad)
    {
        r.u();
        super.a(ad);
    }

    public void a(ad ad, Intent intent, int i)
    {
        c(intent);
        super.a(ad, intent, i);
        j();
    }

    public void a(vt vt)
    {
        r.j();
        super.a(vt);
    }

    public void b(vt vt)
    {
        r.k();
        super.b(vt);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (r.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public void finish()
    {
        r.i();
        super.finish();
    }

    public hof getLifecycle()
    {
        return r;
    }

    public void onActivityResult(int i, int k, Intent intent)
    {
        r.a(i, k, intent);
        super.onActivityResult(i, k, intent);
    }

    public void onAttachedToWindow()
    {
        r.d();
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        if (!r.l())
        {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (r.p())
        {
            return true;
        } else
        {
            return super.onContextItemSelected(menuitem);
        }
    }

    public void onCreate(Bundle bundle)
    {
        r.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        r.o();
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (r.a(menu))
        {
            return true;
        } else
        {
            return super.onCreateOptionsMenu(menu);
        }
    }

    public void onDestroy()
    {
        r.c();
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        r.e();
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (r.m())
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (r.n())
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        r.t();
        super.onLowMemory();
    }

    public void onNewIntent(Intent intent)
    {
        r.g();
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (r.a(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        r.b();
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        r.a(bundle);
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        r.a();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (r.b(menu))
        {
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        r.a(i, as, ai);
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        r.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        h.a(u_());
        r.r();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        r.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        h.a(u_());
        r.q();
        super.onStart();
    }

    public void onStop()
    {
        r.s();
        super.onStop();
    }

    protected void onUserLeaveHint()
    {
        r.h();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        r.f();
        super.onWindowFocusChanged(flag);
    }

    public void startActivity(Intent intent)
    {
        c(intent);
        super.startActivity(intent);
        j();
    }

    public void startActivity(Intent intent, Bundle bundle)
    {
        c(intent);
        super.startActivity(intent, bundle);
        j();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        c(intent);
        super.startActivityForResult(intent, i);
        j();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        c(intent);
        super.startActivityForResult(intent, i, bundle);
        j();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
    {
        c(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        j();
    }
}
