// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class hpe extends ai
    implements hoe
{

    private int j;
    public final hpf l = new hpf();

    public hpe()
    {
    }

    private void a(Intent intent)
    {
        int i = j;
        j = i + 1;
        if (i == 0)
        {
            l.a(intent);
        }
    }

    private void g()
    {
        j = j - 1;
    }

    public void a(ad ad)
    {
        l.u();
        super.a(ad);
    }

    public void a(ad ad, Intent intent, int i)
    {
        a(intent);
        super.a(ad, intent, i);
        g();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (l.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public void finish()
    {
        l.i();
        super.finish();
    }

    public hof getLifecycle()
    {
        return l;
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        l.k();
        super.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        l.j();
        super.onActionModeStarted(actionmode);
    }

    public void onActivityResult(int i, int k, Intent intent)
    {
        l.a(i, k, intent);
        super.onActivityResult(i, k, intent);
    }

    public void onAttachedToWindow()
    {
        l.d();
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        if (!l.l())
        {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (l.p())
        {
            return true;
        } else
        {
            return super.onContextItemSelected(menuitem);
        }
    }

    public void onCreate(Bundle bundle)
    {
        l.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        l.o();
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (l.a(menu))
        {
            return true;
        } else
        {
            return super.onCreateOptionsMenu(menu);
        }
    }

    public void onDestroy()
    {
        l.c();
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        l.e();
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (l.m())
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (l.n())
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        l.t();
        super.onLowMemory();
    }

    public void onNewIntent(Intent intent)
    {
        l.g();
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (l.a(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        l.b();
        super.onPause();
    }

    public void onPostCreate(Bundle bundle)
    {
        l.a(bundle);
        super.onPostCreate(bundle);
    }

    public void onPostResume()
    {
        l.a();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (l.b(menu))
        {
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai1[])
    {
        l.a(i, as, ai1);
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        l.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        h.a(u_());
        l.r();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        l.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        h.a(u_());
        l.q();
        super.onStart();
    }

    public void onStop()
    {
        l.s();
        super.onStop();
    }

    public void onUserLeaveHint()
    {
        l.h();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        l.f();
        super.onWindowFocusChanged(flag);
    }

    public void startActivity(Intent intent)
    {
        a(intent);
        super.startActivity(intent);
        g();
    }

    public void startActivity(Intent intent, Bundle bundle)
    {
        a(intent);
        super.startActivity(intent, bundle);
        g();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        a(intent);
        super.startActivityForResult(intent, i);
        g();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
        g();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        g();
    }
}
