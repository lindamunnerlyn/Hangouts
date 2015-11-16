// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class fwk
    implements android.os.Parcelable.Creator
{

    public fwk()
    {
    }

    public static void a(ChannelEventParcelable channeleventparcelable, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, channeleventparcelable.a);
        g.a(parcel, 2, channeleventparcelable.b, i);
        g.b(parcel, 3, channeleventparcelable.c);
        g.b(parcel, 4, channeleventparcelable.d);
        g.b(parcel, 5, channeleventparcelable.e);
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int i1 = g.a(parcel);
        ChannelImpl channelimpl = null;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    g.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = g.e(parcel, j1);
                    break;

                case 2: // '\002'
                    channelimpl = (ChannelImpl)g.a(parcel, j1, ChannelImpl.CREATOR);
                    break;

                case 3: // '\003'
                    k = g.e(parcel, j1);
                    break;

                case 4: // '\004'
                    j = g.e(parcel, j1);
                    break;

                case 5: // '\005'
                    i = g.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ChannelEventParcelable(l, channelimpl, k, j, i);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new ChannelEventParcelable[i];
    }
}
