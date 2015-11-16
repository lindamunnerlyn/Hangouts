// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ad
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final hm a = new hm();
    static final Object j = new Object();
    boolean A;
    int B;
    aq C;
    ao D;
    aq E;
    ad F;
    int G;
    int H;
    String I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    int Q;
    ViewGroup R;
    View S;
    View T;
    boolean U;
    boolean V;
    bs W;
    boolean X;
    boolean Y;
    Object Z;
    Object aa;
    Object ab;
    Object ac;
    Object ad;
    Object ae;
    Boolean af;
    Boolean ag;
    dt ah;
    dt ai;
    int k;
    View l;
    int m;
    Bundle n;
    SparseArray o;
    int p;
    String q;
    Bundle r;
    ad s;
    int t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public ad()
    {
        k = 0;
        p = -1;
        t = -1;
        O = true;
        V = true;
        Z = null;
        aa = j;
        ab = null;
        ac = j;
        ad = null;
        ae = j;
        ah = null;
        ai = null;
    }

    static boolean a(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        flag = ad.isAssignableFrom(class1);
        return flag;
    }

    public static ad instantiate(Context context, String s1)
    {
        return instantiate(context, s1, null);
    }

    public static ad instantiate(Context context, String s1, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new af((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new af((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new af((new StringBuilder("Unable to instantiate fragment ")).append(s1).append(": make sure class name exists, is public, and has an empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        context = (ad)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.r = bundle;
        return context;
    }

    View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (E != null)
        {
            E.noteStateNotSaved();
        }
        return onCreateView(layoutinflater, viewgroup, bundle);
    }

    final void a(int i1, ad ad1)
    {
        p = i1;
        if (ad1 != null)
        {
            q = (new StringBuilder()).append(ad1.q).append(":").append(p).toString();
            return;
        } else
        {
            q = (new StringBuilder("android:fragment:")).append(p).toString();
            return;
        }
    }

    void a(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        if (E != null)
        {
            E.a(configuration);
        }
    }

    boolean a(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!J)
        {
            boolean flag = flag2;
            if (N)
            {
                flag = flag2;
                if (O)
                {
                    flag = true;
                    onPrepareOptionsMenu(menu);
                }
            }
            flag1 = flag;
            if (E != null)
            {
                flag1 = flag | E.a(menu);
            }
        }
        return flag1;
    }

    boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!J)
        {
            boolean flag = flag2;
            if (N)
            {
                flag = flag2;
                if (O)
                {
                    flag = true;
                    onCreateOptionsMenu(menu, menuinflater);
                }
            }
            flag1 = flag;
            if (E != null)
            {
                flag1 = flag | E.a(menu, menuinflater);
            }
        }
        return flag1;
    }

    boolean a(MenuItem menuitem)
    {
        while (!J && (N && O && onOptionsItemSelected(menuitem) || E != null && E.a(menuitem))) 
        {
            return true;
        }
        return false;
    }

    void b(Bundle bundle)
    {
        if (E != null)
        {
            E.noteStateNotSaved();
        }
        P = false;
        onCreate(bundle);
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                if (E == null)
                {
                    h();
                }
                E.a(bundle, null);
                E.j();
            }
        }
    }

    void b(Menu menu)
    {
        if (!J)
        {
            if (N && O)
            {
                onOptionsMenuClosed(menu);
            }
            if (E != null)
            {
                E.b(menu);
            }
        }
    }

    boolean b(MenuItem menuitem)
    {
        while (!J && (onContextItemSelected(menuitem) || E != null && E.b(menuitem))) 
        {
            return true;
        }
        return false;
    }

    void c(Bundle bundle)
    {
        if (E != null)
        {
            E.noteStateNotSaved();
        }
        P = false;
        onActivityCreated(bundle);
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (E != null)
        {
            E.k();
        }
    }

    void d(Bundle bundle)
    {
        onSaveInstanceState(bundle);
        if (E != null)
        {
            android.os.Parcelable parcelable = E.i();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(G));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(H));
        printwriter.print(" mTag=");
        printwriter.println(I);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(k);
        printwriter.print(" mIndex=");
        printwriter.print(p);
        printwriter.print(" mWho=");
        printwriter.print(q);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(B);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(v);
        printwriter.print(" mRemoving=");
        printwriter.print(w);
        printwriter.print(" mResumed=");
        printwriter.print(x);
        printwriter.print(" mFromLayout=");
        printwriter.print(y);
        printwriter.print(" mInLayout=");
        printwriter.println(z);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(J);
        printwriter.print(" mDetached=");
        printwriter.print(K);
        printwriter.print(" mMenuVisible=");
        printwriter.print(O);
        printwriter.print(" mHasMenu=");
        printwriter.println(N);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(L);
        printwriter.print(" mRetaining=");
        printwriter.print(M);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(V);
        if (C != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(C);
        }
        if (D != null)
        {
            printwriter.print(s1);
            printwriter.print("mHost=");
            printwriter.println(D);
        }
        if (F != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(F);
        }
        if (r != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(r);
        }
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(n);
        }
        if (o != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(o);
        }
        if (s != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(s);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(u);
        }
        if (Q != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(Q);
        }
        if (R != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(R);
        }
        if (S != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(S);
        }
        if (T != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(S);
        }
        if (l != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(l);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(m);
        }
        if (W != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            W.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (E != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder("Child ")).append(E).append(":").toString());
            E.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    void g()
    {
        p = -1;
        q = null;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = 0;
        C = null;
        E = null;
        D = null;
        G = 0;
        H = 0;
        I = null;
        J = false;
        K = false;
        M = false;
        W = null;
        X = false;
        Y = false;
    }

    public final ai getActivity()
    {
        if (D == null)
        {
            return null;
        } else
        {
            return (ai)D.h();
        }
    }

    public boolean getAllowEnterTransitionOverlap()
    {
        if (ag == null)
        {
            return true;
        } else
        {
            return ag.booleanValue();
        }
    }

    public boolean getAllowReturnTransitionOverlap()
    {
        if (af == null)
        {
            return true;
        } else
        {
            return af.booleanValue();
        }
    }

    public final Bundle getArguments()
    {
        return r;
    }

    public final ap getChildFragmentManager()
    {
        if (E != null) goto _L2; else goto _L1
_L1:
        h();
        if (k < 5) goto _L4; else goto _L3
_L3:
        E.m();
_L2:
        return E;
_L4:
        if (k >= 4)
        {
            E.l();
        } else
        if (k >= 2)
        {
            E.k();
        } else
        if (k > 0)
        {
            E.j();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public Context getContext()
    {
        if (D == null)
        {
            return null;
        } else
        {
            return D.i();
        }
    }

    public Object getEnterTransition()
    {
        return Z;
    }

    public Object getExitTransition()
    {
        return ab;
    }

    public final ap getFragmentManager()
    {
        return C;
    }

    public final Object getHost()
    {
        if (D == null)
        {
            return null;
        } else
        {
            return D.g();
        }
    }

    public final int getId()
    {
        return G;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        bundle = D.c();
        getChildFragmentManager();
        ip.a(bundle, E.t());
        return bundle;
    }

    public bq getLoaderManager()
    {
        if (W != null)
        {
            return W;
        }
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            Y = true;
            W = D.a(q, X, true);
            return W;
        }
    }

    public final ad getParentFragment()
    {
        return F;
    }

    public Object getReenterTransition()
    {
        if (ac == j)
        {
            return getExitTransition();
        } else
        {
            return ac;
        }
    }

    public final Resources getResources()
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            return D.i().getResources();
        }
    }

    public final boolean getRetainInstance()
    {
        return L;
    }

    public Object getReturnTransition()
    {
        if (aa == j)
        {
            return getEnterTransition();
        } else
        {
            return aa;
        }
    }

    public Object getSharedElementEnterTransition()
    {
        return ad;
    }

    public Object getSharedElementReturnTransition()
    {
        if (ae == j)
        {
            return getSharedElementEnterTransition();
        } else
        {
            return ae;
        }
    }

    public final String getString(int i1)
    {
        return getResources().getString(i1);
    }

    public final transient String getString(int i1, Object aobj[])
    {
        return getResources().getString(i1, aobj);
    }

    public final String getTag()
    {
        return I;
    }

    public final ad getTargetFragment()
    {
        return s;
    }

    public final int getTargetRequestCode()
    {
        return u;
    }

    public final CharSequence getText(int i1)
    {
        return getResources().getText(i1);
    }

    public boolean getUserVisibleHint()
    {
        return V;
    }

    public View getView()
    {
        return S;
    }

    void h()
    {
        E = new aq();
        E.a(D, new ae(this), this);
    }

    public final boolean hasOptionsMenu()
    {
        return N;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    void i()
    {
        if (E != null)
        {
            E.noteStateNotSaved();
            E.g();
        }
        P = false;
        onStart();
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStart()").toString());
        }
        if (E != null)
        {
            E.l();
        }
        if (W != null)
        {
            W.g();
        }
    }

    public final boolean isAdded()
    {
        return D != null && v;
    }

    public final boolean isDetached()
    {
        return K;
    }

    public final boolean isHidden()
    {
        return J;
    }

    public final boolean isInLayout()
    {
        return z;
    }

    public final boolean isMenuVisible()
    {
        return O;
    }

    public final boolean isRemoving()
    {
        return w;
    }

    public final boolean isResumed()
    {
        return x;
    }

    public final boolean isVisible()
    {
        return isAdded() && !isHidden() && S != null && S.getWindowToken() != null && S.getVisibility() == 0;
    }

    void j()
    {
        if (E != null)
        {
            E.noteStateNotSaved();
            E.g();
        }
        P = false;
        onResume();
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onResume()").toString());
        }
        if (E != null)
        {
            E.m();
            E.g();
        }
    }

    void k()
    {
        onLowMemory();
        if (E != null)
        {
            E.s();
        }
    }

    void l()
    {
        if (E != null)
        {
            E.n();
        }
        P = false;
        onPause();
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }

    void m()
    {
        if (E != null)
        {
            E.o();
        }
        P = false;
        onStop();
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    void n()
    {
label0:
        {
            if (E != null)
            {
                E.p();
            }
            if (X)
            {
                X = false;
                if (!Y)
                {
                    Y = true;
                    W = D.a(q, X, false);
                }
                if (W != null)
                {
                    if (M)
                    {
                        break label0;
                    }
                    W.c();
                }
            }
            return;
        }
        W.d();
    }

    void o()
    {
        if (E != null)
        {
            E.q();
        }
        P = false;
        onDestroyView();
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (W != null)
        {
            W.f();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        P = true;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
    }

    public void onAttach(Activity activity)
    {
        P = true;
    }

    public void onAttach(Context context)
    {
        P = true;
        if (D == null)
        {
            context = null;
        } else
        {
            context = D.h();
        }
        if (context != null)
        {
            P = false;
            onAttach(((Activity) (context)));
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        P = true;
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        P = true;
    }

    public Animation onCreateAnimation(int i1, boolean flag, int j1)
    {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        getActivity().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public void onDestroy()
    {
        P = true;
        if (!Y)
        {
            Y = true;
            W = D.a(q, X, false);
        }
        if (W != null)
        {
            W.h();
        }
    }

    public void onDestroyOptionsMenu()
    {
    }

    public void onDestroyView()
    {
        P = true;
    }

    public void onDetach()
    {
        P = true;
    }

    public void onHiddenChanged(boolean flag)
    {
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        P = true;
    }

    public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
    {
        P = true;
        if (D == null)
        {
            context = null;
        } else
        {
            context = D.h();
        }
        if (context != null)
        {
            P = false;
            onInflate(((Activity) (context)), attributeset, bundle);
        }
    }

    public void onLowMemory()
    {
        P = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu)
    {
    }

    public void onPause()
    {
        P = true;
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
    }

    public void onRequestPermissionsResult(int i1, String as[], int ai1[])
    {
    }

    public void onResume()
    {
        P = true;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    }

    public void onStart()
    {
        P = true;
        if (!X)
        {
            X = true;
            if (!Y)
            {
                Y = true;
                W = D.a(q, X, false);
            }
            if (W != null)
            {
                W.b();
            }
        }
    }

    public void onStop()
    {
        P = true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
    }

    public void onViewStateRestored(Bundle bundle)
    {
        P = true;
    }

    void p()
    {
        if (E != null)
        {
            E.r();
        }
        P = false;
        onDestroy();
        if (!P)
        {
            throw new du((new StringBuilder("Fragment ")).append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

    public void registerForContextMenu(View view)
    {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String as[], int i1)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            D.a(this, as, i1);
            return;
        }
    }

    public void setAllowEnterTransitionOverlap(boolean flag)
    {
        ag = Boolean.valueOf(flag);
    }

    public void setAllowReturnTransitionOverlap(boolean flag)
    {
        af = Boolean.valueOf(flag);
    }

    public void setArguments(Bundle bundle)
    {
        if (p >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            r = bundle;
            return;
        }
    }

    public void setEnterSharedElementCallback(dt dt)
    {
        ah = dt;
    }

    public void setEnterTransition(Object obj)
    {
        Z = obj;
    }

    public void setExitSharedElementCallback(dt dt)
    {
        ai = dt;
    }

    public void setExitTransition(Object obj)
    {
        ab = obj;
    }

    public void setHasOptionsMenu(boolean flag)
    {
        if (N != flag)
        {
            N = flag;
            if (isAdded() && !isHidden())
            {
                D.d();
            }
        }
    }

    public void setInitialSavedState(ag ag1)
    {
        if (p >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (ag1 != null && ag1.a != null)
        {
            ag1 = ag1.a;
        } else
        {
            ag1 = null;
        }
        n = ag1;
    }

    public void setMenuVisibility(boolean flag)
    {
        if (O != flag)
        {
            O = flag;
            if (N && isAdded() && !isHidden())
            {
                D.d();
            }
        }
    }

    public void setReenterTransition(Object obj)
    {
        ac = obj;
    }

    public void setRetainInstance(boolean flag)
    {
        if (flag && F != null)
        {
            throw new IllegalStateException("Can't retain fragements that are nested in other fragments");
        } else
        {
            L = flag;
            return;
        }
    }

    public void setReturnTransition(Object obj)
    {
        aa = obj;
    }

    public void setSharedElementEnterTransition(Object obj)
    {
        ad = obj;
    }

    public void setSharedElementReturnTransition(Object obj)
    {
        ae = obj;
    }

    public void setTargetFragment(ad ad1, int i1)
    {
        s = ad1;
        u = i1;
    }

    public void setUserVisibleHint(boolean flag)
    {
        if (!V && flag && k < 4)
        {
            C.a(this);
        }
        V = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        U = flag;
    }

    public boolean shouldShowRequestPermissionRationale(String s1)
    {
        if (D != null)
        {
            return D.a(s1);
        } else
        {
            return false;
        }
    }

    public void startActivity(Intent intent)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            D.a(this, intent, -1);
            return;
        }
    }

    public void startActivityForResult(Intent intent, int i1)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(this).append(" not attached to Activity").toString());
        } else
        {
            D.a(this, intent, i1);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        g.a(this, stringbuilder);
        if (p >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(p);
        }
        if (G != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(G));
        }
        if (I != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(I);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public void unregisterForContextMenu(View view)
    {
        view.setOnCreateContextMenuListener(null);
    }

}
