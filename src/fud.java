// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;

public final class fud
    implements android.os.Parcelable.Creator
{

    public fud()
    {
    }

    public static void a(DataItemAssetParcelable dataitemassetparcelable, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, dataitemassetparcelable.a);
        g.a(parcel, 2, dataitemassetparcelable.a());
        g.a(parcel, 3, dataitemassetparcelable.b());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        int j = g.a(parcel);
        int i = 0;
        String s = null;
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DataItemAssetParcelable(i, s, s1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new DataItemAssetParcelable[i];
    }
}
