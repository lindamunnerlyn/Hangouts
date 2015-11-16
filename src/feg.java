// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

public final class feg
    implements android.os.Parcelable.Creator
{

    public feg()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = g.a(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TogglingData(i, s, s1, s2);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new TogglingData[i];
    }
}
