// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

public class hkg extends ps
{

    private int j;
    public final hkk q = new hkk();

    public hkg()
    {
    }

    private void c(Intent intent)
    {
        int i = j;
        j = i + 1;
        if (i == 0)
        {
            q.a(intent);
        }
    }

    private void j()
    {
        j = j - 1;
    }

    public void a(ad ad)
    {
        q.s();
        super.a(ad);
    }

    public void a(ad ad, Intent intent, int i)
    {
        c(intent);
        super.a(ad, intent, i);
        j();
    }

    public void a(vr vr)
    {
        q.j();
        super.a(vr);
    }

    public void b(vr vr)
    {
        q.k();
        super.b(vr);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (q.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public void finish()
    {
        q.i();
        super.finish();
    }

    public void onActivityResult(int i, int k, Intent intent)
    {
        q.a(i, k, intent);
        super.onActivityResult(i, k, intent);
    }

    public void onAttachedToWindow()
    {
        q.d();
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        if (!q.l())
        {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        q.c(bundle);
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (q.a(menu))
        {
            return true;
        } else
        {
            return super.onCreateOptionsMenu(menu);
        }
    }

    public void onDestroy()
    {
        q.c();
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        q.e();
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (q.m())
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (q.n())
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        q.r();
        super.onLowMemory();
    }

    public void onNewIntent(Intent intent)
    {
        q.g();
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (q.a(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        q.b();
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        q.a(bundle);
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        q.a();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (q.b(menu))
        {
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        q.a(i, as, ai);
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        q.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        h.a(t_());
        q.p();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        q.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        h.a(t_());
        q.o();
        super.onStart();
    }

    public void onStop()
    {
        q.q();
        super.onStop();
    }

    protected void onUserLeaveHint()
    {
        q.h();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        q.f();
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
