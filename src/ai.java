// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ai extends ab
    implements r, s
{

    final Handler a = new aj(this);
    final an b = new an(new ak(this));
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;

    public ai()
    {
    }

    private static String a(View view)
    {
        byte byte0;
        byte byte1;
        StringBuilder stringbuilder;
        byte1 = 70;
        byte0 = 46;
        stringbuilder = new StringBuilder(128);
        stringbuilder.append(view.getClass().getName());
        stringbuilder.append('{');
        stringbuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringbuilder.append(' ');
        view.getVisibility();
        JVM INSTR lookupswitch 3: default 100
    //                   0: 523
    //                   4: 534
    //                   8: 545;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append('.');
_L11:
        char c1;
        Object obj;
        String s1;
        int j;
        if (view.isFocusable())
        {
            c1 = 'F';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isEnabled())
        {
            c1 = 'E';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.willNotDraw())
        {
            c1 = '.';
        } else
        {
            c1 = 'D';
        }
        stringbuilder.append(c1);
        if (view.isHorizontalScrollBarEnabled())
        {
            c1 = 'H';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isVerticalScrollBarEnabled())
        {
            c1 = 'V';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isClickable())
        {
            c1 = 'C';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isLongClickable())
        {
            c1 = 'L';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        stringbuilder.append(' ');
        if (view.isFocused())
        {
            c1 = byte1;
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isSelected())
        {
            c1 = 'S';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        c1 = byte0;
        if (view.isPressed())
        {
            c1 = 'P';
        }
        stringbuilder.append(c1);
        stringbuilder.append(' ');
        stringbuilder.append(view.getLeft());
        stringbuilder.append(',');
        stringbuilder.append(view.getTop());
        stringbuilder.append('-');
        stringbuilder.append(view.getRight());
        stringbuilder.append(',');
        stringbuilder.append(view.getBottom());
        j = view.getId();
        if (j == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(" #");
        stringbuilder.append(Integer.toHexString(j));
        obj = view.getResources();
        if (j == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & j;
        JVM INSTR lookupswitch 2: default 436
    //                   16777216: 616
    //                   2130706432: 610;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(j);
_L12:
        s1 = ((Resources) (obj)).getResourceTypeName(j);
        obj = ((Resources) (obj)).getResourceEntryName(j);
        stringbuilder.append(" ");
        stringbuilder.append(view);
        stringbuilder.append(":");
        stringbuilder.append(s1);
        stringbuilder.append("/");
        stringbuilder.append(((String) (obj)));
_L6:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L2:
        stringbuilder.append('V');
          goto _L11
_L3:
        stringbuilder.append('I');
          goto _L11
_L4:
        stringbuilder.append('G');
          goto _L11
_L10:
        view = "app";
          goto _L12
_L9:
        view = "android";
          goto _L12
        view;
          goto _L6
    }

    private void a(String s1, PrintWriter printwriter, View view)
    {
        printwriter.print(s1);
        if (view != null) goto _L2; else goto _L1
_L1:
        printwriter.println("null");
_L4:
        return;
_L2:
        printwriter.println(a(view));
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int k = view.getChildCount();
            if (k > 0)
            {
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
                int j = 0;
                while (j < k) 
                {
                    a(s1, printwriter, view.getChildAt(j));
                    j++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        return b.a(view, s1, context, attributeset);
    }

    public void a(ad ad1)
    {
    }

    public void a(ad ad1, Intent intent, int j)
    {
        if (j == -1)
        {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((0xffff0000 & j) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, (ad1.p + 1 << 16) + (0xffff & j));
            return;
        }
    }

    void a(boolean flag)
    {
        if (!f)
        {
            f = true;
            g = flag;
            a.removeMessages(1);
            t_();
        }
    }

    public boolean a(View view, Menu menu)
    {
        return super.onPreparePanel(0, view, menu);
    }

    public void a_()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            finishAfterTransition();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public final void a_(int j)
    {
        if (i)
        {
            i = false;
        } else
        if ((j & 0xffffff00) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        }
    }

    public void b_()
    {
        b.k();
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int j = android.os.Build.VERSION.SDK_INT;
        printwriter.print(s1);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.print(s2);
        printwriter.print("mCreated=");
        printwriter.print(c);
        printwriter.print("mResumed=");
        printwriter.print(d);
        printwriter.print(" mStopped=");
        printwriter.print(e);
        printwriter.print(" mReallyStopped=");
        printwriter.println(f);
        b.a(s2, filedescriptor, printwriter, as);
        b.a().a(s1, filedescriptor, printwriter, as);
        printwriter.print(s1);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s1).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    public bq f()
    {
        return b.b();
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        b.e();
        int l = j >> 16;
        if (l != 0)
        {
            l--;
            int i1 = b.c();
            if (i1 == 0 || l < 0 || l >= i1)
            {
                (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(j));
                return;
            }
            ad ad1 = (ad)b.a(new ArrayList(i1)).get(l);
            if (ad1 == null)
            {
                (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(j));
                return;
            } else
            {
                ad1.onActivityResult(0xffff & j, k, intent);
                return;
            }
        } else
        {
            super.onActivityResult(j, k, intent);
            return;
        }
    }

    public void onBackPressed()
    {
        if (!b.a().c())
        {
            a_();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        b.d();
        super.onCreate(bundle);
        al al1 = (al)getLastNonConfigurationInstance();
        if (al1 != null)
        {
            b.a(al1.c);
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            an an1 = b;
            if (al1 != null)
            {
                bundle = al1.b;
            } else
            {
                bundle = null;
            }
            an1.a(parcelable, bundle);
        }
        b.h();
    }

    public boolean onCreatePanelMenu(int j, Menu menu)
    {
        if (j == 0)
        {
            boolean flag = super.onCreatePanelMenu(j, menu);
            boolean flag1 = b.a(menu, getMenuInflater());
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(j, menu);
        }
    }

    public volatile View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
    {
        return super.onCreateView(view, s1, context, attributeset);
    }

    public volatile View onCreateView(String s1, Context context, AttributeSet attributeset)
    {
        return super.onCreateView(s1, context, attributeset);
    }

    public void onDestroy()
    {
        super.onDestroy();
        a(false);
        b.o();
        b.s();
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 5 && j == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyDown(j, keyevent);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        b.p();
    }

    public boolean onMenuItemSelected(int j, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(j, menuitem))
        {
            return true;
        }
        switch (j)
        {
        default:
            return false;

        case 0: // '\0'
            return b.a(menuitem);

        case 6: // '\006'
            return b.b(menuitem);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.e();
    }

    public void onPanelClosed(int j, Menu menu)
    {
        j;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 27;
           goto _L1 _L2
_L1:
        super.onPanelClosed(j, menu);
        return;
_L2:
        b.b(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        d = false;
        if (a.hasMessages(2))
        {
            a.removeMessages(2);
            b_();
        }
        b.l();
    }

    public void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        b_();
        b.q();
    }

    public boolean onPreparePanel(int j, View view, Menu menu)
    {
        if (j == 0 && menu != null)
        {
            if (h)
            {
                h = false;
                menu.clear();
                onCreatePanelMenu(j, menu);
            }
            return a(view, menu) | b.a(menu);
        } else
        {
            return super.onPreparePanel(j, view, menu);
        }
    }

    public void onRequestPermissionsResult(int j, String as[], int ai1[])
    {
        int k;
        int l;
label0:
        {
            k = j >> 8 & 0xff;
            if (k != 0)
            {
                k--;
                l = b.c();
                if (l != 0 && k >= 0 && k < l)
                {
                    break label0;
                }
                (new StringBuilder("Activity result fragment index out of range: 0x")).append(Integer.toHexString(j));
            }
            return;
        }
        ad ad1 = (ad)b.a(new ArrayList(l)).get(k);
        if (ad1 == null)
        {
            (new StringBuilder("Activity result no fragment exists for index: 0x")).append(Integer.toHexString(j));
            return;
        } else
        {
            ad1.onRequestPermissionsResult(j & 0xff, as, ai1);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        a.sendEmptyMessage(2);
        d = true;
        b.q();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        if (e)
        {
            a(true);
        }
        List list = b.g();
        hm hm = b.u();
        if (list == null && hm == null)
        {
            return null;
        } else
        {
            al al1 = new al();
            al1.a = null;
            al1.b = list;
            al1.c = hm;
            return al1;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = b.f();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void onStart()
    {
        super.onStart();
        e = false;
        f = false;
        a.removeMessages(1);
        if (!c)
        {
            c = true;
            b.i();
        }
        b.e();
        b.q();
        b.r();
        b.j();
        b.t();
    }

    public void onStateNotSaved()
    {
        b.e();
    }

    public void onStop()
    {
        super.onStop();
        e = true;
        a.sendEmptyMessage(1);
        b.m();
    }

    public void q_()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            invalidateOptionsMenu();
            return;
        } else
        {
            h = true;
            return;
        }
    }

    public void startActivityForResult(Intent intent, int j)
    {
        if (j != -1 && (0xffff0000 & j) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, j);
            return;
        }
    }

    void t_()
    {
        b.a(g);
        b.n();
    }

    public ap u_()
    {
        return b.a();
    }
}
