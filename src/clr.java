// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

public final class clr
    implements ListAdapter
{

    final DebugBitmapsActivity a;

    clr(DebugBitmapsActivity debugbitmapsactivity)
    {
        a = debugbitmapsactivity;
        super();
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return 13;
    }

    public Object getItem(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return anv.p();

        case 1: // '\001'
            return anv.a(amv.b);

        case 2: // '\002'
            return anv.q();

        case 3: // '\003'
            return anv.m();

        case 4: // '\004'
            return anv.o();

        case 5: // '\005'
            return anv.i();

        case 6: // '\006'
            return anv.k();

        case 7: // '\007'
            return anv.d();

        case 8: // '\b'
            return anv.l();

        case 9: // '\t'
            return anv.n();

        case 10: // '\n'
            return anv.h();

        case 11: // '\013'
            return anv.j();

        case 12: // '\f'
            return anv.c();
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        view1 = view;
        if (view == null)
        {
            view1 = a.getLayoutInflater().inflate(g.fG, viewgroup, false);
        }
        view = (Bitmap)getItem(i);
        if (view == null) goto _L2; else goto _L1
_L1:
        TextView textview;
        TextView textview1;
        TextView textview2;
        ImageView imageview;
        viewgroup = (TextView)view1.findViewById(h.gq);
        textview = (TextView)view1.findViewById(h.gr);
        textview1 = (TextView)view1.findViewById(h.gs);
        textview2 = (TextView)view1.findViewById(h.gt);
        imageview = (ImageView)view1.findViewById(h.P);
        i;
        JVM INSTR tableswitch 0 12: default 168
    //                   0 242
    //                   1 251
    //                   2 260
    //                   3 269
    //                   4 278
    //                   5 287
    //                   6 296
    //                   7 305
    //                   8 314
    //                   9 323
    //                   10 332
    //                   11 341
    //                   12 350;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L3:
        textview.setText("");
        i = view.getWidth();
        int j = view.getHeight();
        textview1.setText((new StringBuilder(23)).append(i).append("x").append(j).toString());
        textview2.setText(view.toString());
        imageview.setImageDrawable(new BitmapDrawable(view));
_L2:
        return view1;
_L4:
        viewgroup.setText("DefaultCircleAvatar");
        continue; /* Loop/switch isn't completed */
_L5:
        viewgroup.setText("MediumDefaultAvatarWithSmsBadge");
        continue; /* Loop/switch isn't completed */
_L6:
        viewgroup.setText("MissedCallPstnAvatar");
        continue; /* Loop/switch isn't completed */
_L7:
        viewgroup.setText("RectBusinessAvatar");
        continue; /* Loop/switch isn't completed */
_L8:
        viewgroup.setText("RectLargeBusinessAvatar");
        continue; /* Loop/switch isn't completed */
_L9:
        viewgroup.setText("RectLargeDefaultAvatar");
        continue; /* Loop/switch isn't completed */
_L10:
        viewgroup.setText("RectLargePstnAvatar");
        continue; /* Loop/switch isn't completed */
_L11:
        viewgroup.setText("RectMediumDefaultAvatar");
        continue; /* Loop/switch isn't completed */
_L12:
        viewgroup.setText("RoundBusinessAvatar");
        continue; /* Loop/switch isn't completed */
_L13:
        viewgroup.setText("RoundLargeBusinessAvatar");
        continue; /* Loop/switch isn't completed */
_L14:
        viewgroup.setText("RoundLargeDefaultAvatar");
        continue; /* Loop/switch isn't completed */
_L15:
        viewgroup.setText("RoundLargePstnAvatar");
        continue; /* Loop/switch isn't completed */
_L16:
        viewgroup.setText("RoundMediumDefaultAvatar");
        if (true) goto _L3; else goto _L17
_L17:
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return getCount() != 0;
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
