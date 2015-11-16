// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class qr extends ai
    implements dw, px, qs
{

    private qt j;

    public qr()
    {
    }

    public void a(Toolbar toolbar)
    {
        i().a(toolbar);
    }

    public void a(dv dv1)
    {
        dv1.a(this);
    }

    public void a(vt vt)
    {
    }

    public boolean a_(Intent intent)
    {
        return bu.a(this, intent);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        i().b(view, layoutparams);
    }

    public void b(Intent intent)
    {
        bu.b(this, intent);
    }

    public void b(vt vt)
    {
    }

    public pq g()
    {
        return i().a();
    }

    public MenuInflater getMenuInflater()
    {
        return i().b();
    }

    public qt i()
    {
        if (j == null)
        {
            j = qt.a(this, getWindow(), this);
        }
        return j;
    }

    public void invalidateOptionsMenu()
    {
        i().f();
    }

    public pw n_()
    {
        return i().h();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        i().a(configuration);
    }

    public void onContentChanged()
    {
    }

    public void onCreate(Bundle bundle)
    {
        i().i();
        i().a(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        i().g();
    }

    public final boolean onMenuItemSelected(int k, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(k, menuitem))
        {
            return true;
        }
        pq pq1 = g();
        if (menuitem.getItemId() == 0x102002c && pq1 != null && (pq1.d() & 4) != 0)
        {
            return r_();
        } else
        {
            return false;
        }
    }

    public boolean onMenuOpened(int k, Menu menu)
    {
        return super.onMenuOpened(k, menu);
    }

    public void onPanelClosed(int k, Menu menu)
    {
        super.onPanelClosed(k, menu);
    }

    public void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        i().c();
    }

    public void onPostResume()
    {
        super.onPostResume();
        i().e();
    }

    public void onStop()
    {
        super.onStop();
        i().d();
    }

    protected void onTitleChanged(CharSequence charsequence, int k)
    {
        super.onTitleChanged(charsequence, k);
        i().a(charsequence);
    }

    public void q_()
    {
        i().f();
    }

    public boolean r_()
    {
        Object obj = s_();
        if (obj != null)
        {
            if (a_(((Intent) (obj))))
            {
                obj = dv.a(this);
                a(((dv) (obj)));
                ((dv) (obj)).b();
                try
                {
                    p.a(this);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    finish();
                }
            } else
            {
                b(((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public Intent s_()
    {
        return bu.b(this);
    }

    public void setContentView(int k)
    {
        i().a(k);
    }

    public void setContentView(View view)
    {
        i().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        i().a(view, layoutparams);
    }
}
