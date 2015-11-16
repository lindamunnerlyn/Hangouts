// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class hpa extends Activity
    implements hoe
{

    private int a;
    public final hnn b = new hnn();

    public hpa()
    {
    }

    private void a()
    {
        a = a - 1;
    }

    private void a(Intent intent)
    {
        int i = a;
        a = i + 1;
        if (i == 0)
        {
            b.a(intent);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (b.a(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public void finish()
    {
        b.i();
        super.finish();
    }

    public hof getLifecycle()
    {
        return b;
    }

    public void onActionModeFinished(ActionMode actionmode)
    {
        b.k();
        super.onActionModeFinished(actionmode);
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        b.j();
        super.onActionModeStarted(actionmode);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        b.a(i, j, intent);
        super.onActivityResult(i, j, intent);
    }

    public void onAttachedToWindow()
    {
        b.d();
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        if (!b.l())
        {
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (b.p())
        {
            return true;
        } else
        {
            return super.onContextItemSelected(menuitem);
        }
    }

    public void onCreate(Bundle bundle)
    {
        b.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        b.o();
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (b.a(menu))
        {
            return true;
        } else
        {
            return super.onCreateOptionsMenu(menu);
        }
    }

    public void onDestroy()
    {
        b.c();
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        b.e();
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (b.m())
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (b.n())
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onLowMemory()
    {
        b.t();
        super.onLowMemory();
    }

    public void onNewIntent(Intent intent)
    {
        b.g();
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (b.a(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        b.b();
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        b.a(bundle);
        super.onPostCreate(bundle);
    }

    protected void onPostResume()
    {
        b.a();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (b.b(menu))
        {
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        b.a(i, as, ai);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        b.b(bundle);
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        b.r();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        b.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            android.app.FragmentManager fragmentmanager = getFragmentManager();
            if (g.tZ == null)
            {
                try
                {
                    g.tZ = fragmentmanager.getClass().getMethod("noteStateNotSaved", new Class[0]);
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    g.t();
                }
            }
            try
            {
                ((Method)g.e(g.tZ)).invoke(fragmentmanager, new Object[0]);
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                g.t();
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                g.t();
            }
        }
        b.q();
        super.onStart();
    }

    public void onStop()
    {
        b.s();
        super.onStop();
    }

    protected void onUserLeaveHint()
    {
        b.h();
        super.onUserLeaveHint();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        b.f();
        super.onWindowFocusChanged(flag);
    }

    public void startActivity(Intent intent)
    {
        a(intent);
        super.startActivity(intent);
        a();
    }

    public void startActivity(Intent intent, Bundle bundle)
    {
        a(intent);
        super.startActivity(intent, bundle);
        a();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        a(intent);
        super.startActivityForResult(intent, i);
        a();
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityForResult(intent, i, bundle);
        a();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i)
    {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i);
        a();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle)
    {
        a(intent);
        super.startActivityFromFragment(fragment, intent, i, bundle);
        a();
    }
}
