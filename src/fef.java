// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

public final class fef
    implements android.os.Parcelable.Creator
{

    public fef()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        Intent intent = null;
        int k = g.a(parcel);
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, l);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, l);
                    break;

                case 4: // '\004'
                    intent = (Intent)g.a(parcel, l, Intent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OverflowMenuItem(i, j, s, intent);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new OverflowMenuItem[i];
    }
}
